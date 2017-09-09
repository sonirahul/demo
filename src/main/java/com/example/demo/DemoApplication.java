package com.example.demo;

import com.example.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class DemoApplication {

	@Value("${username}")
	private String username;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String testMethod() {
		User user = new User();
		user.setFirstName("Rahul");
		user.setLastName("Soni");
		log.debug(user.toString());
		System.out.println("hello");
		return username + " " + user.toString();
	}
}
