package com.crm.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringApplicationRest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringApplicationRest.class, args);

	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name",defaultValue="World")String name)
	{
		return "Hello "+name;
	}
	
	

}
