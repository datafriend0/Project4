package com.proj3.bookCab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages = "com.proj3.bookCab") // Enables annotations for @RestController, @Repository, @Service
@EnableJpaRepositories (basePackages = "com.proj3.bookCab.Repository")
@EntityScan (basePackages = "com.proj3.bookCab.Entity") //Entity classes enabled in Spring Boot
@ComponentScan
public class BookCabApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCabApplication.class, args);
		System.out.println("Server Up");
	}

}
