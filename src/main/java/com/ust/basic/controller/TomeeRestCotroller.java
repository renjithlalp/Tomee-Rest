package com.ust.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomeeRestCotroller {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello Developer";
	}

}
