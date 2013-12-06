package P99

/**
 *
 * P02 (*) Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5

 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 12/5/13
 * Time: 2:44 PM
 *
 */
object P02 {
  /**
   * Using the build-in methods in Scala
   *
   * @param xs
   * @tparam A
   * @return
   */
  def penultimateBuildIn[A](xs: List[A]): A = xs.init.last

  /**
   * Using pattern matching
   *
   * @param xs
   * @tparam A
   * @return
   */
  def penultimateRecursive[A](xs: List[A]): A = xs match {
    case head :: last :: Nil => head
    case head :: tail => penultimateRecursive(tail)
    case _ => throw new NoSuchElementException
  }


  ////////////////////////////////////////
  //
  ////////////////////////////////////////
  val xs = List(1, 1, 2, 3, 5, 8)

  def main(args: Array[String]) {
    println(P02.penultimateRecursive(xs))
  }

}

