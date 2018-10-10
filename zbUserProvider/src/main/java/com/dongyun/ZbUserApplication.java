package com.dongyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.dongyun.app.dao")
public class ZbUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZbUserApplication.class, args);
	}
}
