
package com.practice
import java.util.Scanner
object Demo
{
  def main(args: Array[String])
  {
           val s=new Calculator()
           s.Operator()
  }
}
class Calculator
{

  var result:Int=0
  def Operator()
    {
      val scan=new Scanner(System.in)
      print("enter a number:")
      val num1=scan.nextInt()

      print("enter a number:")
      val num2=scan.nextInt()

      print("select operator(+,-,/,*,%):")
      val op=scan.next().charAt(0)
      op match{
        case '+'=> result=num1+num2
        case '-'=> result=num1-num2
        case '*'=> result=num1*num2
        case '/'=> result=num1/num2
        case '%'=> result=num1%num2
        case _=>printf("Invalid operation.\n")
      }
      println("Result: "+result);

    }
}