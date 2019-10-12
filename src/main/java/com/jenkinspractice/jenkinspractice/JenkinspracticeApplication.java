package com.jenkinspractice.jenkinspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JenkinspracticeApplication  {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinspracticeApplication.class, args);
		
		System.out.println("Mahesh Jenkisn Working ---------->");
		
	}		
}
