package com.practice

object Classesexample1
{
    def main(args:Array[String]): Unit =
  {
     var ob=new Details()
    ob.display()
  }
  class Details
  {
    var name:String="sree"
    var id:Int=201
    var percentage:Double=5.4
     def display(): Unit =
    {
      println("name of the candidate: " +name)
      println("id of the candidate: " +id)
      println("height of the percentage: " +percentage)
    }

  }
}
