package com.example.multimodule.application

import com.example.multimodule.service.MyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController(
    private val myService: MyService,
) {
    @GetMapping("/")
    fun home(): String = myService.message()
}
