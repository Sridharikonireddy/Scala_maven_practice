package PracPrograms
import java.util.Scanner
object numbers extends App {

 var scan = new Scanner(System.in)
  println("Enter Number")
  var n = scan.nextInt()
  if (n % 2 == 0) {
    println("number is even")
  }
  else
    {
    println("not even")
}

  println("enter a string")
  var n1 = scan.nextLine()
  if(n1.length()==10)
  println("String has 10 chars")
  else
    println("bo its has no 10 chars")

  for(i<-1 to 1000000)
        {
          println(i)
        }
  for(i<-100000 to (1,-1))
          {
            println(i)
          }
  for (i <- 1 to 1000000) {
    if (i % 2 == 0) {
      println(i)
    }
  }
}




