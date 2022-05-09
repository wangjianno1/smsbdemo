package com.soar.smsbdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soar.smsbdemo.mapper")
public class SmsbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsbdemoApplication.class, args);
	}

}
