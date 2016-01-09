package com.taikongcao.common.spark.dataset

/**
  * Created by brook on 16-1-9.
  */

/**
  *
  * @param label 类别标记
  * @param data 样本数据
  * @tparam KT 数据的键类型
  * @tparam VT 数据的值类型
  */
class SparkInstance[KT: String with Double, VT: String with Double](
                                                                     val label: Double,
                                                                     val data: Map[KT, VT]
                                                                   ) {
  /**
    * 获得样本的String表示
    *
    * @return
    */
  override def toString() : String = {
    label + "\t" +
      data.map(x => (x._1.toString + ":" + x._2.toString))
        .mkString("\t")
  }
}

object SparkInstance{



  def apply(str : String): SparkInstance ={
    //解析数据属性键值对，键名不可以包括:号，因为是我们可以控制的，值里可以包括值
    def parsePair(pairStr : String): Unit ={
      val splits = pairStr.split(":")
    }
    //\t在所有的数据中不可以出现
    val splits = str.split("\t").filter(!_.trim.isEmpty)
    val label = splits(0).toDouble

    null

  }
}


