package com.practice

import com.practice

object Enums extends Enumeration{
  type Enums = Value

  // Assigning values
  val first = Value("Thriller")
  val second = Value("Horror")
  val third = Value("Comedy")
  val fourth = Value("Romance")

  // Main method
  def main(args: Array[String])
  {
    println(s"Main Movie Genres = ${Enums.values}")//printing all elements
    println(s"The third value = ${Enums.third}")//printing paricular element
    println(s"ID of third = ${Enums.third.id}")//Printing ID of value
    Enums.values.foreach
    {
      // Matching values in Enumeration
      case d if ( d == Enums.third ) =>
        println(s"Favourite type of Movie = $d")
      case _ => None
    }
  }

}
