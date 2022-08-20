package kr.dataportal.application

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Heli
 * Created on 2022. 08. 21
 */
@RestController
class HealthCheckRestController {

    @RequestMapping("/api/ping")
    fun ping() = "pong"
}
