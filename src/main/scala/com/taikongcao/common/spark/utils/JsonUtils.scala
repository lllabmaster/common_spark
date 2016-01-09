package com.taikongcao.common.spark.utils

import java.text.DateFormat

import com.fasterxml.jackson.databind.{DeserializationFeature, SerializationFeature, MapperFeature, ObjectMapper}

/**
  * Created by brook on 16-1-9.
  */
object JsonUtils {

    val mapper = new ObjectMapper()
    //遇到没有定义的属性，不会失败
    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)

}
