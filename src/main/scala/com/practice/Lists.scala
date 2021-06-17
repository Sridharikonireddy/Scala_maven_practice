package com.practice
import scala.collection.immutable._
object Lists {
  def main(args: Array[String]): Unit = {
    var L1:List[String]=List("s","r","e","e")
    println(L1)
    for(a<-L1)
    {
      println(a)
    }
    var L2:List[Nothing]=List()
    println(L2)
    var L3:List[List[Int]]=
      List(List(1,3,35))
    println(L3)
    println(L1.head)
    println(L1.tail)
    println(L2.isEmpty)
    var L4=List.fill(5)("sree")
    println(L4)
    println(L1.reverse)
    var L5=L1.reverse
    println(L5)
    var L6=List(89,77,25,66,22,9.0)
    println(L6)
    var L7=L6.sorted
    println(L7)
    var L8=L1++L6
    println(L8)
    println(L6(2))

    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    println(fruit)

    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    println(nums)


    val empty = Nil
    println(empty)

    val dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
    println(dim)

  }
}

