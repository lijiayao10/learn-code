package com.cc.learncode.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableConfigServer
@SpringBootApplication
public class Application {
	
	@RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
