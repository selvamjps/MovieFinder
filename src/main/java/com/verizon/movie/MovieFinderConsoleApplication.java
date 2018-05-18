package com.verizon.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("application-context.xml")
public class MovieFinderConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieFinderConsoleApplication.class, args);
	}
}
