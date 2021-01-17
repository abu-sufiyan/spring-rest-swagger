package com.example.ccube.sampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class samplecontroller {
	
	@GetMapping("/health")
	public String healthStatus()
	{
		
		System.out.println("healthStatus called ");
		return "UP";
	}

}
