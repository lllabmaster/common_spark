package com.taikongcao.common.spark.dataset

/**
  * Created by brook on 16-1-9.
  */
class SparkDateSet[KT >: Double with String, VT >: Double with String](
                                          val metaMap : Map[KT,VT]
                                  ) {

  override def toString() : String = {
    "Test"
  }

}




