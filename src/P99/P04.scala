package P99

/**
 *
 * Find the number of elements of a list.
 * Example:
 * scala> length(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 6
 *
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 12/5/13
 * Time: 6:23 PM
 *
 */
object P04 {

  /**
   * Build-in method of List
   *
   * @param xs
   * @tparam A
   * @return
   */
  def lenthBuildIn[A](xs:List[A]):Int = xs.length

  def lenthRecursive[A](xs:List[A]):Int = {
    xs match {
      case Nil =>0
      case _ ::tail => 1+lenthRecursive(tail)
      case _ => throw new NoSuchElementException
    }
  }

  ////////////////////////////////////////
  //
  ////////////////////////////////////////
  val list = List(1, 1, 2, 3, 5, 8)

  def main(args: Array[String]) {
    println(lenthRecursive(list))
  }


}
