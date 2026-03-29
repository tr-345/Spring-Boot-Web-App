package com.javabyhemant.Spring_Boot_Web_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/api")
public class SpringBootWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppApplication.class, args);
	}


    @GetMapping("/test")
    public String testAppliaction(){
        return "Spring-Boot-Web-App Runing Sucess ...!";
    }
}
