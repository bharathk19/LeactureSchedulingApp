package com.lecturescheduling.demo.testpractise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarInitilaztion {

	@Autowired
	@Qualifier("BMW")
	protected Car car;
	
	public void servcie()
	{
		car.engine();
		car.parts();
		car.transmission();
	}
}
