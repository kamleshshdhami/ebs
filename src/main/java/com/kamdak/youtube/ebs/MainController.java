package com.kamdak.youtube.ebs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/welcome")
	public String welcomePage(){
		return "Welcome to KAMDAK page! This is the new version of our application";
	}

}
