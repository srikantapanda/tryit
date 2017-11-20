package com.example.demo;

	
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8090);  
		SpringApplication.run(DemoApplication.class, args);
	}


}
