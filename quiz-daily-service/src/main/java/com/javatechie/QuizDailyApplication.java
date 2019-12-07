package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javatechie.gurupadam.seggregation.Segregation;

@SpringBootApplication
public class QuizDailyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QuizDailyApplication.class, args);

		/* Guru changes started */
		Segregation seg = context.getBean("segregation", Segregation.class);
		int[] arrayTest = new int[] { 1, 1, 0, 1, 0, 1, 1, 0, 1 };
		arrayTest = seg.segregate0and1(arrayTest);
		System.out.println("Array Result After Segregation");
		for (int i = 0; i < arrayTest.length; i++) {
			System.out.print(arrayTest[i] + " ");
		}
		
		/* Guru changes Ended */
	}

}
