package com.api.prices.crypto.cryptoprices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import com.api.prices.crypto.cryptoprices.utils.SchedulingTasks;

@SpringBootApplication
@EnableScheduling
public class CryptoPricesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoPricesApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public SchedulingTasks task() {
		return new SchedulingTasks();
	}
}
