package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("branch test");
		System.out.println("Test commit add5");
		System.out.println("Test commit 메롱~~~");
		System.out.println("pr test");
	}

}
