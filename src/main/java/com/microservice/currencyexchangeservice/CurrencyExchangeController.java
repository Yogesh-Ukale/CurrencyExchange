package com.microservice.currencyexchangeservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {


    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retriveValue(@PathVariable String from, @PathVariable String to) {
        return new ExchangeValue(1000l, from, to, BigDecimal.valueOf(65));
    }

}
