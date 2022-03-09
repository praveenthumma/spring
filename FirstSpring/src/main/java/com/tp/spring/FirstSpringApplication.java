package com.tp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringApplication.class, args);
		context.getBean(SomeRandom.class).code();
	}

}
