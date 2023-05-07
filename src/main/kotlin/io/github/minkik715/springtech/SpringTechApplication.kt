package io.github.minkik715.springtech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTechApplication

fun main(args: Array<String>) {
    runApplication<SpringTechApplication>(*args)
}
