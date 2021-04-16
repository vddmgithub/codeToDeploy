package com.pluralsight.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceDemoApplication {

	public static void main(String[] args) {

		try{
			SpringApplication.run(ConferenceDemoApplication.class, args);
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

}
