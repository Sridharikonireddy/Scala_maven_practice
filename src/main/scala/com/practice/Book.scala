package com.practice

case class Book(name: String, author: String)
object Caseclass
{
  def main(args: Array[String])
  {
    val B1 = Book("Data Structure and Algorithm", "cormen")
    val B2 = Book("Computer Networking", "Tanenbaum")

    // Display strings
    println("Name of the Book1 is " + B1.name)
    println("Author of the Book1 is " + B1.author)
    println("Name of the Book2 is " + B2.name)
    println("Author of the Book2 is " + B2.author)
    // Display copied data
    val B3 = B1.copy()
    println("copy name " + B3.name)
    println("copy author " + B3.author)
    //Display copied and changed attributes
    val B4 = B2.copy(author = "Mahesh")
    println("copy name is " + B4.name)
    println("copy author is " + B4.author)
  }
}
