package com.lecturescheduling.demo.testpractise;

import org.springframework.stereotype.Component;

@Component
public class Merc implements Car{

	@Override
	public void engine() {
		System.out.println(" This is an MERC Engine: ");
		
	}

	@Override
	public void parts() {
		System.out.println(" This are MERC spare parts: ");
		
	}

	@Override
	public void transmission() {
		System.out.println(" This is an MERC Transmission: ");
		
	}

}
