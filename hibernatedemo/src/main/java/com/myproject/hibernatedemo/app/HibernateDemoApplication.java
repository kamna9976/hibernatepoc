package com.myproject.hibernatedemo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.myproject.hibernatedemo")
public class HibernateDemoApplication {
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/myDemoApp");
		SpringApplication.run(HibernateDemoApplication.class, args);
	}
}
