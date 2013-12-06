package P99

/**
 * (*) Reverse a list.
 * Example:
 * scala> reverse(List(1, 1, 2, 3, 5, 8))
 * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 *
 * Created with IntelliJ IDEA.
 * User: emerson
 * Date: 12/5/13
 * Time: 6:44 PM
 *
 */
object P05 {

  def reverseBuildIn[A](xs:List[A]):List[A] = xs.reverse

  def reverseRecursive[A](xs:List[A]):List[A] = xs match {
    case h::Nil => List(h)
    case h::tail => reverseRecursive(tail) ::: List(h)
    case _ => throw new NoSuchElementException
  }

  def reverseTailRecursive [A](xs:List[A]):List[A] = {
    def reverse(result:List[A], curList:List[A]):List[A] = curList match {
      case Nil => result
      case h::tail => reverse(h::result,tail)
    }

    reverse(Nil,xs)
  }


  ////////////////////////////////////////
  //
  ////////////////////////////////////////
  val data =List(1, 1, 2, 3, 5, 8)
  def main(args: Array[String]) {
    println(reverseRecursive(data))
    println(reverseTailRecursive(data))
  }

}
