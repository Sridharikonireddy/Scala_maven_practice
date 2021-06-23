package com.practice

object pureFun1 {
  def main(args: Array[String]): Unit = {
    println("The mileage of my bike is: " + mileageCal(342, 9))


    def mileageCal(distance: Int, fuel: Int): Float = {
      val mileage = distance / fuel
      return (mileage);
    }
  }
}
