package com.practice
import java.util.Scanner
object Prime
{
     def main(args:Array[String]) {

       val scan = new Scanner(System.in)
       println("Enter the number to check prime:")
       val num = scan.nextInt()
       primeDemo(num)

     }
  def primeDemo(n:Int)
  {
    var k=0
    if(n==1)
      println("not prime")
    else
      {
        for(i<- 2 until n-1)
        {
          if (n % i == 0)

            k = k + 1
        }

              if(k!=0)

                  println("not prime")
              else

                  println("prime")
          }
      }

}
