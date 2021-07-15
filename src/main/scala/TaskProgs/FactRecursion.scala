package TaskProgs
import java.util.Scanner

import java.util.Scanner

object FactRecursion
{
  def main(args: Array[String]) {

    val scan = new Scanner(System.in)
    print("enter a number:")
    val n1 = scan.nextInt()
    println(factorial(n1))
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }
}
