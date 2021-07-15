package TaskProgs

import java.util.Scanner

object primerecusrion extends App
{

  val scan = new Scanner(System.in)
  println("Enter the number to check prime:")
  val num = scan.nextInt()
  if (isPrime2(num)) println("%d is prime.".format(num)) else println("not prime")
  def isPrime2(i :Int) : Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i - 1)).exists(x => i % x == 0)
  }




}
