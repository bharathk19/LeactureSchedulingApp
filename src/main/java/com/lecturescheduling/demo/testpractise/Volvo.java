package com.lecturescheduling.demo.testpractise;

import org.springframework.stereotype.Component;

@Component
public class Volvo implements Car {

	@Override
	public void engine() {
		System.out.println(" This is an VOLVO Engine: ");

	}

	@Override
	public void parts() {
		System.out.println(" This are VOLVO spare parts: ");

	}

	@Override
	public void transmission() {
		System.out.println(" This is an VOLVO Transmission: ");

	}

}
