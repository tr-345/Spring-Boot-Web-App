package com.javabyhemant.Spring_Boot_Web_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping(value = {"/value/{value}", "/value"})
    @ResponseBody
    public String testpathparametr(@PathVariable Optional<String> value){

       value= value.map(String::toUpperCase).or(() -> Optional.of(""));
        return "Spring-Boot-Web-App Runing Sucess ...! "+value.get();
    }
}
