package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class HelloService {
	
	@RequestMapping("/hello")
	public void sayHello() {
		System.out.println("Hello Everyone");
	}

}
