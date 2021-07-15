package TaskProgs

object arrayStrinIntdouble extends App{
  var arr = Array(1, 2, 3, 4, 5)

    for (a <- arr)
      println(a)
    println("Third Element  = " + arr(2))

  var q = Array("sree", "Lakshmi", "pranay")
  for (a <- q) {
    println(a)
  }
  var q1 = Array(1.2, 2.3, 4.5)
  for (a <- q1) {
    println(a)

  }
}
