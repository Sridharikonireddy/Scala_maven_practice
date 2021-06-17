package com.practice
import scala.collection.immutable._


object ListDemoMap {

      def main(args: Array[String]): Unit = {

            val listMap = ListMap("Rice" -> "100", "Wheat" -> "50", "Gram" -> "500")

            println(listMap)
            var em = new ListMap()
            println(em)
            listMap.foreach {
                  case (key, value) => println(key + " -> " + value)
                        listMap.foreach {
                              case (key, value) => println(key + "->" + value)
                                    println(listMap("Gram"))
                                    var newListMap = listMap + ("Pulses" -> "550")
                                    println(newListMap)
                                    newListMap.foreach {
                                          case (key, value) => println(key + " -> " + value)
                                    }
                        }
            }
      }
}



