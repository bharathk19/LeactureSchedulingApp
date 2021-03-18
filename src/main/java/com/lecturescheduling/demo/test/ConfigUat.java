package com.lecturescheduling.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Profile("UAT")
public class ConfigUat {

	@Autowired
	private Environment environemt;
	
	@Bean
	public String returnsString()
	{
		System.out.println(" the exectuion method is in the "+ this.getClass().getName());
		System.out.println(" the property of servcie url is "+ environemt.getProperty("SERVICE_URL"));
		return "hello";
	}
}
