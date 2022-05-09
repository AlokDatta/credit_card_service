package com.app.card.unittest;

import com.app.card.controller.CreditCardController;
import com.app.card.service.CreditCardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TestConfig {

    @Bean
    public CreditCardController creditCardController() {
        return new CreditCardController();
    }

    @Bean
    public CreditCardService creditCardService() {
        CreditCardService.init();
        return new CreditCardService();
    }

}
