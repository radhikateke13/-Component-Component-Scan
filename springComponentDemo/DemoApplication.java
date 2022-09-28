package com.spring.springComponentDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Annotation based spring context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.springComponentDemo");
		context.refresh();

		// Getting the Bean from the component class
		ComponentDemo componentDemo = context.getBean(ComponentDemo.class);
		componentDemo.demoFunction();

		// Closing the context
		// using close() method
		context.close();
	}
}
