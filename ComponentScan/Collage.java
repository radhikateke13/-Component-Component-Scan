package com.spring.ComponentScan;

import org.springframework.stereotype.Component;

@Component("CollageBean")
public class Collage {

	public void getData() {
		System.out.println("Collage Data");
	}
}
