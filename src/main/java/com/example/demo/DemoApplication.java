package com.example.demo;

import com.example.demo.calculator.Calculator;
import com.example.demo.cash.Currency;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	@Value("${spring.profiles.active}")
	private  String[] activeProfile;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);


		Currency usd = context.getBean("usd", Currency.class);
//		System.out.println(usd);

		Currency eur = context.getBean("eur", Currency.class);
//		System.out.println(eur);

		Currency chf = context.getBean("chf", Currency.class);
//		System.out.println(chf);

		Currency gbp = context.getBean("gbp", Currency.class);
//		System.out.println(gbp);


		Currency jpy = context.getBean("jpy", Currency.class);
//		System.out.println(jpy);

		Currency pln = context.getBean("pln", Currency.class);
//		System.out.println(pln);

		Calculator calculator = context.getBean(Calculator.class);
		calculator.setAmount(20);
		String currencyName = calculator.getFirstCurrency().getName();
		double amount = calculator.getAmount();

		System.out.println(amount+" "+ currencyName + " = " + calculator.calculate(usd) + " " + usd.getName());
		System.out.println(amount+" "+ currencyName  + " = " + calculator.calculate(eur) + " " + eur.getName());
		System.out.println(amount+" "+ currencyName  + " = " + calculator.calculate(chf) + " " + chf.getName());
		System.out.println(amount+" "+ currencyName  + " = " + calculator.calculate(gbp) + " " + gbp.getName());
		System.out.println(amount+" "+ currencyName  + " = " + calculator.calculate(jpy) + " " + jpy.getName());
		System.out.println(amount+" "+ currencyName  + " = " + calculator.calculate(pln) + " " + pln.getName());


	}

}
