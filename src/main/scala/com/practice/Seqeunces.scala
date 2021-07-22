package com.practice

object Seqeunces  extends App
{
  val aSequence = Seq(1,3,2,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2)) // takes the item at index 2 (in this case 3)
  println(aSequence ++ Seq(7,5,6)) // for concatenation
  println(aSequence.sorted) // sorts into order, if the type is by default ordered

  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println) // prints all the numbers from 1 to 10

  (1 to 10).foreach(x => println("Hello"))

  val aList = List(1,2,3)
  val prepended = 42 :: aList
  println(prepended)

  val prepend_append = 42 +: aList :+ 88
  println(prepend_append)

  val apple5 = List.fill(5)("apple")
  println(apple5)

  println(aList.mkString("-"))


}
