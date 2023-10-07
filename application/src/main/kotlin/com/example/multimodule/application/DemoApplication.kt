package com.example.multimodule.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.multimodule"])
class DemoApplication

fun main() {
    runApplication<DemoApplication>()
}