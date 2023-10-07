package com.example.multimodule.application

import com.example.multimodule.service.MyService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTest {
    @Autowired
    private lateinit var myService: MyService

    @Test
    fun contextLoads() {
        assertThat(myService.message()).isNotNull()
    }
}
