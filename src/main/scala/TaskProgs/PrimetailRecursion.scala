package TaskProgs

import scala.annotation.tailrec

import java.util.Scanner

object PrimetailRecursion extends App {
  val scan = new Scanner(System.in)
  print("enter a number:")
  val n1 = scan.nextInt()

  println(isPrime(n1))

  def isPrime(n: Int): Boolean = {
    @tailrec def isPrimeUntil(t: Int): Boolean = {
      if (t == 2) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)

  }
}
