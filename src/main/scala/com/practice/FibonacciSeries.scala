package com.practice
import java.util.Scanner
object FibonacciSeries
{
   def main(args:Array[String])
     {
        var scan=new Scanner(System.in)
        println("Enter Number of Terms:")
       var n=scan.nextInt()
       var s=new Demo()
       s.Fibonacci(n)

     }
}
class Demo {


  def Fibonacci(num: Int)
  {
    var a = 0
    var b = 1
    var i= 0
    println("fibonacci sereis are")
    print(a)
    print(b)
    while(i<num-2)
    {
      val c = a + b
      print(c)
      a = b
      b = c
      i=i+1
    }




  }
}
