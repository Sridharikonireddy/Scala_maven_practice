package com.practice
import scala.collection.immutable._


object ListDemoMap {

      def main(args: Array[String]): Unit = {

            val listMap = ListMap("Rice" -> "100", "Wheat" -> "50", "Gram" -> "500")
            val emptyListMap = new ListMap()
            println(listMap)
            println(emptyListMap)
            listMap.foreach {
                  case (key, value) => println(key + "->" + value)
                        println(listMap("Gram"))
                        var newListMap = listMap + ("Pulses" -> "550")
                        newListMap.foreach {
                              case (key, value) => println(key + " -> " + value)
                        }
            }
      }
}



