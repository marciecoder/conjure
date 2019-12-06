package com.github.marciecoder.spellbook.conjure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConjureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConjureApplication.class, args);
	}

}
