package com.chl.recommand_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
//@ComponentScan("com.chl.recommand_backend.**")
@RestController
public class RecommendBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecommendBackendApplication.class, args);
	}
	@RequestMapping(value = "/")


	public String First_page(){
		System.out.print("Welcome");
		return null;
	}
}
