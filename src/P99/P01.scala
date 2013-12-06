package P99

/**
 * Find the last element of a list.
 *
 * Example:
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 *
 *
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 12/5/13
 * Time: 2:22 PM
 *
 */
object P01 {

  /**
   * Using default implementation of List in Scala
   *
   * @param xs
   * @tparam A
   * @return
   */
  def lastBuildIn[A](xs:List[A]):A = xs.last

  /**
   *  Reach the last element of a list in a recursive way.
   *
   * @param xs
   * @tparam A
   * @return
   */
  def lastRecursive[A](xs:List[A]):A = xs match {
    case h :: Nil => h //the last of list, return h
    case h :: tail => lastRecursive(tail) // h is not the last element, continue rec
    case _ =>throw new NoSuchElementException()
  }

  /**
   * Reach the last element of a list by index
   *
   * @param xs
   * @tparam A
   * @return
   */
  def lastIndex[A](xs:List[A]):A = xs(xs.length-1)

  //////////////////////////////////////////////
  //
  //////////////////////////////////////////////
  val xs = List(1, 1, 2, 3, 5, 8)

  def main(args: Array[String]) {
    println(P01.lastBuildIn(xs))

    println(P01.lastRecursive(xs))

    println(P01.lastIndex(xs))

  }


}