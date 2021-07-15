package TaskProgs

import java.util.Scanner

object ListString extends App
{

  val scan = new Scanner(System.in)
  print("enter list")
  val n1 = scan.nextLine()
  ListString(n1)
  def ListString(fruit: String*) {
    if (fruit.head!=0)
      println(fruit)
    else
      println(fruit.isEmpty)
  }
}
