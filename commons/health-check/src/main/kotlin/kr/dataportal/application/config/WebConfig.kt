package kr.dataportal.application.config

import kr.dataportal.application.HealthCheckRestController
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * @author Heli
 * Created on 2022. 08. 21
 */
@Configuration
@ComponentScan(basePackageClasses = [HealthCheckRestController::class])
class WebConfig
