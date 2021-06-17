package com.practice

/*class ArrayExample{
  var arr = Array(1,2,3,4,5)
  def show(){
    for(a<-arr)
          println(a)
    println("Third Element  = "+ arr(2))
  }
}

object Array1{
  def main(args:Array[String]){
    var a = new ArrayExample()
    a.show()
  }
}*/

/*class ArrExample
{
  var ar=Array(1,2,3,4,5,6,7,8,9)

  def Demo()
  {
    for(i<-ar)
        println(i)
  }

}
object Array1
{
  def main(args:Array[String])
  {
    var i = new ArrExample()
    i.Demo()
  }
}*/

/*class ArrayExample{
  var arr = new Array[Int](5)
  def show(){
    for(a<-arr)
    {
      println(a)
    }
      arr(2)=100
      println(arr(2))

  }
}

object SingleArrays{
  def main(args:Array[String]){
    var a = new ArrayExample()
    a.show()
  }
}*/

/*object SingleArrays{
  def main(args:Array[String]) {
    var q = Array("sree", "Lakshmi", "pranay")
    for (a <- q) {
      println(a)
    }

    q(1) = "lucky"
    for (a <- q) {
      println(a)
    }
    println(q(1))
  }

}*/


/*import Array._
  object SingleArrays{
  def main(args:Array[String]): Unit =
  {
    var arr=new Array[Int](4)
    arr(0)=1
    arr(1)=2
    arr(2)=3
    arr(3)=4
    for(a<-arr)
      {
        println(a)
      }
      var arr1=new Array[Int](3)
    arr1(0)=5
    arr1(1)=6
    arr1(2)=7
    for(a<-arr1) {
      println(a)
    }
    var arr2=Array(1,2,3,4)
    var arr3=Array(5,6,7,8)
    var arr4=concat(arr2,arr3)
    for(a<-arr4)
      {
        println(a)
      }

  }
  }*/
/*object SingleArrays
{
  def main(args:Array[String]): Unit =
  {
    var s=Array.ofDim[String](1,4)
    s(0)(0)="s"
    s(0)(1)="r"
    s(0)(2)="e"
    s(0)(3)="e"
    for(a<-0 to 1) {
      for(a1<-0 to 4){
        println(s(a)(a1))
      }
      }
    }
}*/

import Array._
object ArrayDemo
{
  def main(args:Array[String]): Unit =
  {
    var arr=Array(1,2,3,4)
    for(a<-arr)
    {
      println(a)
    }
    var arr1=5+:arr
    for(a<-arr1)
    {
      println(a)
    }
    var arr2=arr1++Array(8,9,10)
    for(a<-arr2)
    {
      println(a)
    }
    var arr3=arr2:+11
    for(a<-arr3){
      println(a)
    }
    var arr4=arr3++Array(12,13,14)
    for(a<-arr4)
    {
      println(a)
    }
  }
}
