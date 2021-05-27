package com.cognizant.truyum;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("com.cognizant.truyum")
@EnableDiscoveryClient
public class TruyumApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TruyumApplication.class, args);
		
	}
}
