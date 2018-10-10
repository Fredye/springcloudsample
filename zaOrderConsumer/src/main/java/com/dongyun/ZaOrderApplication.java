package com.dongyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ZaOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZaOrderApplication.class, args);
	}
}
