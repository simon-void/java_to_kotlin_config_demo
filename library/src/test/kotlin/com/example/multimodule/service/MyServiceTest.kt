package com.example.multimodule.service

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest("service.message=Hello")
class MyServiceTest {
    @Autowired
    private lateinit var myService: MyService

    @Test
    fun contextLoads() {
        assertThat(myService.message()).isNotNull()
    }

    @SpringBootApplication
    internal class TestConfiguration
}
