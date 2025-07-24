package Katas

object CreatePhoneNumber extends App{
//  Description:
//  Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
//  Example
//
//  createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)) # => returns "(123) 456-7890"

  def createPhoneNumber(numbers: Seq[Int]): String = {
    val groups = numbers.grouped(3).toList.map(x => x.mkString)
    s"(${groups(0)}) ${groups(1)}-${groups(2)}${groups(3)}"
  }

  println(createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)))
}

