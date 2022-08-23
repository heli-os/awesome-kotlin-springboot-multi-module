package kr.dataportal.application

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.PropertyAccessor
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.afterburner.AfterburnerModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

/**
 * @author Heli
 * Created on 2022. 08. 23
 */
val GLOBAL_OBJECT_MAPPER: ObjectMapper =
    jacksonObjectMapper()
        .configure(DeserializationFeature.USE_LONG_FOR_INTS, true)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
        .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
        .registerModules(JavaTimeModule(), AfterburnerModule())

fun <T> String.parseJson(type: Class<T>): T = GLOBAL_OBJECT_MAPPER.readValue(this, type)

fun Any.toJson(): String = GLOBAL_OBJECT_MAPPER.writeValueAsString(this)
