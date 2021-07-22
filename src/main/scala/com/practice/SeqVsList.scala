package com.practice
import scala.util.Random



object SeqVsList extends App
{
  val maxRuns = 1000
  val maxCapacity = 1000000

  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random

    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), r.nextInt()) // as this random index, put a value of r.nextInt() into the collection
      System.nanoTime() - currentTime
    }

    times.sum * 1.0 / maxRuns // this computes the average time it takes for the collection to be updated

  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  println(getWriteTime(numbersList))
  println(getWriteTime(numbersVector))

}
