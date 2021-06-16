package com.practice
import java.util.Scanner

object Factorial
{
  def main(args: Array[String]): Unit = {

    val scan = new Scanner(System.in)
    print("enter a number:")
    val n = scan.nextInt()
    Factorial(n)

  }
  def Factorial(num:Int): Unit =
  {
    var fact = 1
    if (num < 0)
    {
      println("Invalid Number")
    }
    else {
      for (i <- 1 to num)
      {
        fact = fact *i
      }
      println(fact)
    }
  }

}
