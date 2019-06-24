package com.agileware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.agileware.model.DateService;

@SpringBootApplication
public class AgilewareStandaloneApplication {


	public static void main(String[] args) {
		SpringApplication.run(AgilewareStandaloneApplication.class, args);
	
	
	}

}
