package TaskProgs

object SetStringIntDouble extends App
{
  var s = Set[Int]()
  s += 1
  println(s)
  s ++=Vector(2,3,4,5,6)
  println(s)
  var s1=s
  println(s1)

  var names=Set[String]()
  names+="sree"
  println(names)
  names ++=Vector("sri","dhari","pra","nay")
  println(names)


  //immutable
  var double=Set[Double]()
  var double1= double+2.0
  println(double1)
  var double2=double1+(3.0,4.0,5.0)
  println(double2)





}
