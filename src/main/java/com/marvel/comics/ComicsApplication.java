package com.marvel.comics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@ComponentScan("com.marvel.comics")
@EnableAutoConfiguration
@EnableRetry
public class ComicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComicsApplication.class, args);
	}

}
