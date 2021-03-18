/* By using this below mechanism with loose coupling we can work with multiple profies
 * i.e with this class we can travel through different environment using the seActiveProfile method
 * which later mapped using @profile annotation in each class. */
package com.lecturescheduling.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lecturescheduling.demo.*")
public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		System.out.println("Arrguments in app: "+ args[0]);
		System.out.println("Environment******************  "+ context.getEnvironment());
		context.getEnvironment().setActiveProfiles(args[0]);
		context.register(App.class);
		context.refresh();
		context.close();

	}

}
