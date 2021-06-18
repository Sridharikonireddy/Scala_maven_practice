package com.practice

import java.util.Scanner

object GetSetProg
{
  def main(args: Array[String]): Unit = {

    val scan=new Scanner(System.in)
    println("enter a number x")
    val x1=scan.nextInt()
    println("enter a number y")
    val y1=scan.nextInt()
    val point1 = new SetDemo
    point1.x = x1
    point1.y = y1
  }

  class SetDemo {
    private var _x = 0
    private var _y = 0
    private val bound = 100

    def x = _x
    def x_= (newValue: Int): Unit = {
      if (newValue < bound) _x = newValue else printWarning
    }

    def y = _y
    def y_= (newValue: Int): Unit = {
      if (newValue < bound)  _y = newValue else printWarning
    }

    private def printWarning = println("WARNING: Out of bounds")
  }




}
