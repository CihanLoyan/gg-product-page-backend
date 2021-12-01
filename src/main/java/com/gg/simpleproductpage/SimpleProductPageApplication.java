package com.gg.simpleproductpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleProductPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleProductPageApplication.class, args);
	}

}
