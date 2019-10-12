package com.jenkinspractice.jenkinspractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyRestController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/myapp")
	public String myApp() {
		
		System.out.println("Start Time : " +System.currentTimeMillis());
		
		/*
		 * for (int i=0; i<10; i++) {
		 * restTemplate.getForObject("http://localhost:2231/myapp", String.class); }
		 */
		System.out.println("End Time : " +System.currentTimeMillis()/1000);
		return "success";
		
	}

}
