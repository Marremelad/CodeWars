package katas

object WhichAreIn extends App {
  //  Description:
  //  Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
  //  Example 1:
  //
  //  a1 = ["arp", "live", "strong"]
  //
  //  a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
  //
  //  returns ["arp", "live", "strong"]
  //  Example 2:
  //
  //  a1 = ["tarp", "mice", "bull"]
  //
  //  a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
  //
  //  returns []
  //  Notes:
  //
  //  Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
  //  In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
  //  Beware: In some languages r must be without duplicates.

  def inArray(array1: Array[String], array2: Array[String]): Array[String] = {
    array1.toSet.filter(s1 => array2.exists(s2 => s2.contains(s1))).toArray.sorted
  }

  println(inArray(Array("arp", "arp", "live", "strong"),
    Array("lively", "alive", "harp", "sharp", "armstrong")).toList)
}
