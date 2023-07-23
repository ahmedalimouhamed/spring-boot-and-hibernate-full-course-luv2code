package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {"com.luv2code.springcoredemo", "com.luv2code.util"})
//@ComponentScan(basePackages = {"com.luv2code.springcoredemo", "com.luv2code.util"})
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}
}
