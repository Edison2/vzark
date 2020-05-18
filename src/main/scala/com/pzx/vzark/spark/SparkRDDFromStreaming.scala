package com.pzx.vzark.spark

object SparkRDDFromStreaming {
  def main(args: Array[String]): Unit = {
    val prices: List[Double] = List(5.0, 20.0, 9.95)
    val ints: List[Int] = List(10, 2, 1)

    println(prices.zip(ints))
  }
}
