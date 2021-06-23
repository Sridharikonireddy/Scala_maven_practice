package com.practice

object ImpureFunction
{
  def main(args: Array[String])
  {
    def add(a:Int, b:Int):Int = {
      var c:Int = a + b;
      return c
    }

    def multiply(a:Int, b:Int):Int = {
      var c:Int = a * b;
      return c
    }

    println("Output in case 1 :" +
      add(1, 2) * multiply(3, 4));
    println("Output in case 2 :" +
      multiply(4, 3) * add(2, 1));
    println(add(1,2))
    println(multiply(4,5))
  }

}
