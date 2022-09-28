package com.spring.ComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class CollageMain {

	public static void main(String[] args) {
		//SpringApplication.run(CollageMain.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(collageConfi.class);
		Collage c = context.getBean("CollageBean", Collage.class);
		c.getData();
	}

}
