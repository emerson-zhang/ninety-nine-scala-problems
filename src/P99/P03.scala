package P99

/**
 *
 * Find the Kth element of a list.
 * By convention, the first element in the list is element 0.
 * Example:
 *
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2

 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 12/5/13
 * Time: 4:31 PM
 *
 */
object P03 {

  /**
   * Using build-in methods
   *
   * @param xs
   * @param n
   * @tparam A
   * @return
   */
  def atIndexBuildIn[A](xs: List[A], n: Int): A = xs(n)

  def atIndexRecursive[A](xs: List[A], n: Int): A = {
    (n, xs) match {
      case (0, h :: _) => h
      case (current, _ :: tail) => atIndexRecursive(tail, current - 1)
      case (_, Nil) => throw new NoSuchElementException
    }
  }

}
