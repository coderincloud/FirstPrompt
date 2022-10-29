package com.rkn.webapps.spring.FirstPrompt;

import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class FirstPromptApplication {

@RequestMapping("/")
String home(){
	return "It has been successful Finally !!";
}
	public static void main(String[] args) {
		SpringApplication.run(FirstPromptApplication.class, args);
	}

}
