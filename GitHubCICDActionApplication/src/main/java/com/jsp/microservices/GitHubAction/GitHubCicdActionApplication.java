package com.jsp.microservices.GitHubAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubCicdActionApplication {
	
	@GetMapping("/getmessage")
	public String getMesssage() {
		return "coding";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubCicdActionApplication.class, args);
	}
	
	

}
