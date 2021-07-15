package TaskProgs
import java.util.Scanner
import scala.annotation.tailrec

object TailREcursFactorial
{
  def main(args:Array[String])
  {
    val scan = new Scanner(System.in)
    print("enter a number:")
    val n1 = scan.nextInt()
    println(factorial(n1))
  }
  def factorial(n: Int): Int =
  {

    @tailrec def factorialAcc(acc: Int, n: Int): Int =
    {
      if (n <= 1)
        acc
      else
        factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  }
}
