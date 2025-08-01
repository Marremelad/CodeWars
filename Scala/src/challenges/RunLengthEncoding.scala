package challenges

import scala.annotation.tailrec

object RunLengthEncoding extends App {

  def rle(s1: String): String = {
    @tailrec
    def grouper(s2: String, previous: Char, acc: String = "", result: List[String] = Nil): List[String] = {
      // Reverse the list of groups, after prepending, to get the correct order.
      if (s2.length <= 0) (acc :: result).reverse
      else {
        val current = s2.head
        if (previous == current) grouper(s2.drop(1), current, current.toString + acc, result)
        else grouper(s2.drop(1), current, current.toString, acc :: result)
      }
    }
    val encoding = grouper(s1, s1.head)
      .map(group => if (group.length == 1) group.head.toString else s"${group.length}${group.head}")

    // If last character is a single character, omit it from the result.
    (if (encoding.last.length == 1) encoding.init else encoding).mkString("")
  }

  println(rle("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB") == "12WB12W3B24W")
}
