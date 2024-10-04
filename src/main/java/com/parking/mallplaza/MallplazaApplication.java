package com.parking.mallplaza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = "com.parking.mallplaza.*"
)


public class MallplazaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallplazaApplication.class, args);
	}

}
