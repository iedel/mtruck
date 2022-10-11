package com.example.mtruck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class MtruckApplication {

	public static void main(String[] args) {
		log.debug("main main main!!!");
		SpringApplication.run(MtruckApplication.class, args);
	}

}
