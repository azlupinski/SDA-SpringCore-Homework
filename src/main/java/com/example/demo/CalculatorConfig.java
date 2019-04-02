package com.example.demo;

import com.example.demo.calculator.Calculator;
import com.example.demo.cash.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import(ExchangeRateBeans.class)
public class CalculatorConfig {

    @Bean
    @Profile("usd")
    public Calculator calcFromUsd(Currency usd){
        Calculator calc = new Calculator();
        calc.setFirstCurrency(usd);
        return calc;
    }

    @Bean
    @Profile("eur")
    public Calculator calcFromEur(Currency eur){
        Calculator calc = new Calculator();
        calc.setFirstCurrency(eur);
        return calc;
    }


    @Bean
    @Profile("chf")
    public Calculator calcFromChf(Currency chf){
        Calculator calc = new Calculator();
        calc.setFirstCurrency(chf);
        return calc;
    }


    @Bean
    @Profile("gbp")
    public Calculator calcFromGbp(Currency gbp){
        Calculator calc = new Calculator();
        calc.setFirstCurrency(gbp);
        return calc;
    }

    @Bean
    @Profile("jpy")
    public Calculator calcFromJpy(Currency jpy){
        Calculator calc = new Calculator();
        calc.setFirstCurrency(jpy);
        return calc;
    }

    @Bean
    @Profile("pln")
    public Calculator calcFromPln(Currency pln){
        Calculator calc = new Calculator();
        calc.setFirstCurrency(pln);
        return calc;
    }




}
