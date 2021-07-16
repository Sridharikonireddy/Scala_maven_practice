package TaskProgs

import java.util.Scanner

object ReadTextFile extends App
{
  val scan = new Scanner(System.in)
  print("enter a String:")
  val n1 = scan.nextLine()
  val count = n1.toCharArray.length
  println("number of characters is: "+count)

}
