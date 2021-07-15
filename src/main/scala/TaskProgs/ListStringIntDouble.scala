package TaskProgs

import scala.collection.immutable.List

object ListStringIntDouble extends App
{

  //String
  var L1:List[String]=List("s","r","e","e")
  println(L1)
  val a = "p" +: L1
  println(a)
  val a1 = List("sri","hi") ++: L1
  println(a1)
//Integer
  var L2=List(89,77,25,66,220,88)
  println(L2)
  val b= 80 +: L2
  val b1=b:+33
  println(b1)
  val b2 = List(223,8668,5987) ++: L2
  println(b2)
  //double
  var L3=List(89.0,77.0,25.0,66.0,220.0,88.0)
  println(L3)
  val c= 80.99+: L3
  val c1=c:+33.33
  println(c1)
  val c2= List(22.3,86.36,59.87) ++: L3
  println(c2)














}
