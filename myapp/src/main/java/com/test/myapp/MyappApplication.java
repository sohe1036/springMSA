package com.test.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyappApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@RequestMapping(value="/hello")
	public String hello() {
		return "<h1>Hello Word</h1>";
	}
}
