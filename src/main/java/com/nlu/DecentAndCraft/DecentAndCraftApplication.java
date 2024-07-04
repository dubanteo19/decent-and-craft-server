package com.nlu.DecentAndCraft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DecentAndCraftApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecentAndCraftApplication.class, args);
	}

}
