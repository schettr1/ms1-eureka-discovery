package com.sbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ms1EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1EurekaServerApplication.class, args);
	}

}
