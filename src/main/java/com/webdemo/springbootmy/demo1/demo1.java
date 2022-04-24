package com.webdemo.springbootmy.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo1 {

	@GetMapping("/hello")
	public String hello() {
		return "helllo";
	}
	
	@GetMapping("/me")
	public String me() {
		return "Poda";
	}
}
