package challenges

import scala.annotation.tailrec

object RunLengthEncoding extends App {
  val s = "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"

  def rle(s: String): String = {
    @tailrec
    def rec(remaining: String, acc: List[String]): List[String] = {
      if (remaining.isEmpty) acc.reverse
      else {
        val (group, rest) = remaining.span(_ == remaining.head)
        rec(rest, group :: acc)
      }
    }

    rec(s, Nil)
      .map(group => if (group.length == 1) group.head.toString else s"${group.length}${group.head}")
      .mkString("")
  }

  println(rle(s))
}
