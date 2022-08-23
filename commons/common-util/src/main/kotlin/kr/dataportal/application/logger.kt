package kr.dataportal.application

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * @author Heli
 * Created on 2022. 08. 23
 */
abstract class ApplicationLogger(loggerName: String? = null) {
    val log: Logger = loggerName?.let {
        LoggerFactory.getLogger(it)
    } ?: if (this::class.isCompanion) {
        LoggerFactory.getLogger(this.javaClass.enclosingClass)
    } else {
        LoggerFactory.getLogger(this::class.java)
    }
}
