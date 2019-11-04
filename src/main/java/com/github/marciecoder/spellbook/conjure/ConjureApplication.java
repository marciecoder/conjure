package com.github.marciecoder.spellbook.conjure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConjureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConjureApplication.class, args);
	}

}
