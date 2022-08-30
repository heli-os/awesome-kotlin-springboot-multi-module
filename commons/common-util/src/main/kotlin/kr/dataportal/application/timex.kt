package kr.dataportal.application

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset

/**
 * @author Heli
 * Created on 2022. 08. 31
 */

fun LocalDateTime.toEpochMillis(zoneId: ZoneId = ZoneOffset.UTC): Long = this.atZone(zoneId).toInstant().toEpochMilli()

fun Long.toLocalDateTime(zoneId: ZoneId = ZoneOffset.UTC): LocalDateTime =
    Instant.ofEpochMilli(this).atZone(zoneId).toLocalDateTime()
