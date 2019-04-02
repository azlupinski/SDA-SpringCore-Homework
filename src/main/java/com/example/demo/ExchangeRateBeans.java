package com.example.demo;


import com.example.demo.cash.Currency;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:prices.properties")
public class ExchangeRateBeans {


    @Value("${usd.name}")
    String usdName;
    @Value("${usd.price}")
    double usdPrice;
    @Bean(name = "usd")
    public Currency exchangeRateToUsd(){

        Currency rate = new Currency(usdName,usdPrice);
        return rate ;
    }


    @Value("${eur.name}")
    String eurName;
    @Value("${eur.price}")
    double eurPrice;
    @Bean(name = "eur")
    public Currency exchangeRateToEur(){

        Currency rate = new Currency(eurName,eurPrice);
        return rate ;
    }


    @Value("${chf.name}")
    String chfName;
    @Value("${chf.price}")
    double chfPrice;
    @Bean(name = "chf")
    public Currency exchangeRateToChf(){

        Currency rate = new Currency(chfName,chfPrice);
        return rate ;
    }


    @Value("${gbp.name}")
    String gbpName;
    @Value("${gbp.price}")
    double gbpPrice;
    @Bean(name = "gbp")
    public Currency exchangeRateToGbp(){

        Currency rate = new Currency(gbpName,gbpPrice);
        return rate ;
    }

    @Value("${jpy.name}")
    String jpyName;
    @Value("${jpy.price}")
    double jpyPrice;
    @Bean(name = "jpy")
    public Currency exchangeRateToJpy(){

        Currency rate = new Currency(jpyName,jpyPrice);
        return rate ;
    }

    @Value("${pln.name}")
    String plnName;
    @Value("${pln.price}")
    double plnPrice;
    @Bean(name = "pln")
    public Currency exchangeRateToPln(){

        Currency rate = new Currency(plnName,plnPrice);
        return rate ;
    }




}
