package com.lecturescheduling.demo.testpractise;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.lecturescheduling.demo.testpractise")
public class MainApplicaiton {
	/*
	 * @Autowired CarInitilaztion car;
	 */
	
	public MainApplicaiton() {
		//car.servcie();
	}
	
	public static void main(String[] args) {
		System.out.println(" THe cursor is in main function ");
		
		  AnnotationConfigApplicationContext context = new
		  AnnotationConfigApplicationContext();
		  context.scan("com.lecturescheduling.demo.testpractise"); context.refresh();
		  CarInitilaztion car = context.getBean(CarInitilaztion.class); car.servcie();
		  
		  context.close();
		 
		//new MainApplicaiton();
		
		}

	

}
