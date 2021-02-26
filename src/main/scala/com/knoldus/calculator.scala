package com.knoldus

import scala.math.pow

class Calculator {
  def +(a: Int, b: Int): Int = a + b

  def -(a: Int, b: Int): Int = a - b

  def *(a: Int, b: Int): Long = a * b

  def /(a: Int, b: Int): Unit = {

    require(b != 0, "denominator can not be 0")
    a / b
  }

  def **(a: Int, b: Int) = pow(b, a).intValue()

  def abs(a: Int) = {
    if (a < 0) -a
    else a
  }

  def %(a: Int, b: Int): Int = a % b

  def max(a: Int,b:Int) = {
    if (a > b) a
    else b
  }
  def min(a: Int,b:Int) = {
    if (a < b) a
    else b
  }
}
object Calendar
{
  def main(args: Array[String]) =
  {
    val cal = new Calculator()

    println("Addition: " + cal.+(10, 2))
    println("Subtraction: " + cal.-(10, 2))
    println("Multiplication: " + cal.*(10, 2))
    println("Division: " + cal./(10, 2))
    println("power: " +cal.**(2,3))
    println("AbsoluteValue: " + cal.abs(-5))
    println("Modulus: " + cal.%(4,3))
    println("Maximum of two: " + cal.max(8,6))
    println("Maximum of two: " + cal.min(2,3))


  }
}
