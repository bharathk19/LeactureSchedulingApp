package com.lecturescheduling.demo.testpractise;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component()
public class BMW implements Car {

	@Override
	public void engine() {
		System.out.println(" This is an BMW Engine: ");

	}

	@Override
	public void parts() {
		System.out.println(" This are BMW spare parts: ");

	}

	@Override
	public void transmission() {
		System.out.println(" This is an BMW Transmission: ");
	}

}
