package com.practice
object ClasExample
{
  def main(args:Array[String]): Unit = {
  val point1 = new Point(2, 3)
  println(point1.x)
    println(point1)
}
  class Point(var x: Int, var y: Int)
      {
        override def toString: String =
          s"($x, $y)"
        }
}