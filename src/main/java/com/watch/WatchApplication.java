package com.watch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info=@Info(title="EmpAPI",version="3.2",description=" watch information"))
@SpringBootApplication
public class WatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatchApplication.class, args);
	}
	
}
