package TaskProgs

import java.util.Scanner

object StringConcatRecurs1 extends App {
  val scan = new Scanner(System.in)
  print("enter a String:")
  val n1 = scan.nextLine()
  print("enter a number:")
  val t1 = scan.nextInt()
  println(someRecursiveFunction(n1,t1))


  def someRecursiveFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + someRecursiveFunction(aString, n - 1)
  }
}
