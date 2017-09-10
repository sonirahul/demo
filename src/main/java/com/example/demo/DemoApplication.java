package com.example.demo;

import com.example.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * boot starting the application.
 */
@SpringBootApplication
@RestController
@Slf4j
public class DemoApplication {

	@Value("${username}")
	private String username;

    /**
     * main method.
     * @param args arguments
     */
	public static void main(final String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


    /**
     * test method.
     * @return String returns data back
     */
	@RequestMapping("/")
	public final String testMethod() {
		User user = new User();
		user.setFirstName("Rahul");
		user.setLastName("Soni");
		log.debug(user.toString());
		return username + " " + user.toString();
	}
}
