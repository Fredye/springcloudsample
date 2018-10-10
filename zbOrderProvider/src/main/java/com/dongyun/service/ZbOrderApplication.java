package com.dongyun.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.dongyun.service.dao")
public class ZbOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZbOrderApplication.class, args);
	}
}
