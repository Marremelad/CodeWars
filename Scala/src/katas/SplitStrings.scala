package katas

object SplitStrings extends App {
//  Description:
//  Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//
//  Examples:
//  * 'abc' =>  ['ab', 'c_']
//  * 'abcdef' => ['ab', 'cd', 'ef']

  def split(s: String): List[String] = {
    val newString = if (s.length % 2 != 0) s :+ '_' else s

    val result = for {
      index <- 0 to s.length - 1 if index % 2 == 0
    } yield newString.drop(index).take(2)

    result.toList
  }

  println(split("abcdefghi"))
}
