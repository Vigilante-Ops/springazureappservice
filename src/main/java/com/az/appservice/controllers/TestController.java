package com.az.appservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String connectionTest()
	{
		return "congo server is up";
	}
	
}
