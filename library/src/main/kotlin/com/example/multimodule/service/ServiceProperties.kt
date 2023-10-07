package com.example.multimodule.service

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding

@ConfigurationProperties("service")
data class ServiceProperties @ConstructorBinding constructor (
	val message: String,
)
