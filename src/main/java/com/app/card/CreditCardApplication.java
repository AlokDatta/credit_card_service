package com.app.card;

import com.app.card.service.CreditCardService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditCardApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CreditCardApplication.class, args);
		CreditCardService.init();
	}
}