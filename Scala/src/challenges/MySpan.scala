package challenges

import scala.annotation.tailrec

// Create your own implementation of the span method in Scala.
object MySpan extends App {
  def mySpan[A](list: List[A], predicate: A => Boolean): (List[A], List[A])  = {
    @tailrec
    def go(list: List[A], predicate: A => Boolean, prefix: List[A], suffix: List[A]): (List[A], List[A]) =
      list match {
        case Nil => (prefix.reverse, suffix)
        case head :: _ =>
          if (predicate(head)) go(list.tail, predicate, head :: prefix, suffix)
          else go(Nil, predicate, prefix, list)
      }
    go (list, predicate, Nil, Nil)
  }

  val (prefix, suffix) = mySpan(List(1, 1, 3, 4, 5), (x: Int) => x % 2 == 1)
  println(prefix)
  println(suffix)
}
