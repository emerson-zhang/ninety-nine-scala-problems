package P99

/**
 * (*) Find out whether a list is a palindrome.
 * Example:
 * scala> isPalindrome(List(1, 2, 3, 2, 1))
 * res0: Boolean = true
 *
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 12/6/13
 * Time: 2:05 PM
 *
 */
object P06 {

  def isPalindromeBuildinMy[A](xs: List[A]): Boolean = xs == xs.reverse

  /**
   * My first solution without list's build in method.
   *
   * first, declare a closure to reverse the list parameter;
   * second, just compare the original list and reversed one.
   *
   * @param xs
   * @tparam A
   * @return
   */
  def isPalindromeMy[A](xs: List[A]): Boolean = {
    def reverse[A](list: List[A]): List[A] = {
      list match {
        case Nil => Nil
        case h :: tail => reverse(tail) ::: List(h)

      }
    }

    xs == reverse(xs)
  }

  def main(args: Array[String]) {
    val correctData = List(1, 2, 3, 2, 1)
    val wrongData = List(5, 2, 3, 2, 1)

    println("==== buildin ======")
    assert(isPalindromeBuildinMy(correctData))
    assert(!isPalindromeBuildinMy(wrongData))

    println("==== my solution ====")
    assert(isPalindromeMy(correctData))
    assert(!isPalindromeMy(wrongData))
  }


}
