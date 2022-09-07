package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.HelloService;

@SpringBootApplication
public class CheckmarxDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CheckmarxDemoApplication.class, args);
		HelloService hs = ctx.getBean(HelloService.class);
		hs.sayHello();
	}

}
