package com.skaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ViewRestrictorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewRestrictorApplication.class, args);
	}

}
