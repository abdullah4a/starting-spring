package com.starter;

import com.starter.entity.Application;
import com.starter.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StartingSpringApplication {
	private static final Logger log = LoggerFactory.getLogger(StartingSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StartingSpringApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Trackzilla","numan","Application for tracking bugs."));
			repository.save(new Application("Expenses","ali","Application to track expense reports."));
			repository.save(new Application("Notifications","TEST","Application to send alerts and notifications to users."));

			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}

}
