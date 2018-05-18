package com.verizon.movie;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import com.verizon.movie.bean.Movie;
import com.verizon.movie.bean.MovieRepository;

@EnableAutoConfiguration
@Component
public class MovieFinderConsole implements CommandLineRunner {

	@Autowired
	private MovieRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void run(String... args) throws Exception 
	{
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
		    logger.info("Enter Movie Title: ");
		    String movieTitle = scanner.next();
		    logger.info("Enter Year Of Release: ");
		    String yearOfRelease = scanner.next();
		    
		    repository.insert(new Movie(movieTitle, yearOfRelease));
		    
		    Thread.sleep(5000);
		}
		
	    scanner.close();
	}
	
	public static void main(String[] args) {
        SpringApplication.run(MovieFinderConsoleApplication.class, args);
    }
}
