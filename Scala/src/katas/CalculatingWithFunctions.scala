package katas

object CalculatingWithFunctions extends App {
//  Description:
//  This time we want to write calculations using functions and get the results. Let's have a look at some examples:
//
//  seven(times(five())   ==  35
//  four(plus(nine())     ==  13
//  eight(minus(three())  ==   5
//  six(dividedBy(two())  ==   3
//
//  Requirements:
//
//  There must be a function for each number from 0 ("zero") to 9 ("nine")
//  There must be a function for each of the following mathematical operations: plus, minus, times, dividedBy
//  Each calculation consist of exactly one operation and two numbers
//  The most outer function represents the left operand, the most inner function represents the right operand
//  Division should be integer division. For example, this, eight(dividedBy(three)), should return 2, not 2.666666...:

  def zero(op: Int => Int = identity): Int = op(0)
  def one(op: Int => Int = identity): Int = op(1)
  def two(op: Int => Int = identity): Int = op(2)
  def three(op: Int => Int = identity): Int = op(3)
  def four(op: Int => Int = identity): Int = op(4)
  def five(op: Int => Int = identity): Int = op(5)
  def six(op: Int => Int = identity): Int = op(6)
  def seven(op: Int => Int = identity): Int = op(7)
  def eight(op: Int => Int = identity): Int = op(8)
  def nine(op: Int => Int = identity): Int = op(9)

  def times(y: Int): Int => Int = (x: Int) => x * y
  def plus(y: Int): Int => Int = (x: Int) => x + y
  def minus(y: Int): Int => Int = (x: Int) => x - y
  def dividedBy(y: Int): Int => Int = (x: Int) => x / y

  println(seven(times(five())))
  println(seven(plus(five())))
  println(seven(minus(five())))
  println(seven(dividedBy(five())))
}
