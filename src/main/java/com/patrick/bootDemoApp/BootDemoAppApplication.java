package com.patrick.bootDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoAppApplication.class, args);
		System.out.println("hello world");
	}

}
