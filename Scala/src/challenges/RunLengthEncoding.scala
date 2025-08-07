package challenges

import scala.annotation.tailrec

object RunLengthEncoding extends App {
  val s = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"

  def rle(s: String): String = {
    @tailrec
    def go(chars: List[Char], acc: String): String = chars match {
      case Nil => acc
      case head :: _ =>
        val (same, different) = chars.span(_ == head)
        val encoded = if (same.length == 1) head.toString else s"${same.length}$head"
        go(different, acc + encoded)
    }
    go(s.toList, "")
  }

  println(rle(s))
}
