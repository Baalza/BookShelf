package com.kaisen.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BookApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

}