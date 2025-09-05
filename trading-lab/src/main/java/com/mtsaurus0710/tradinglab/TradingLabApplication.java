package com.mtsaurus0710.tradinglab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TradingLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingLabApplication.class, args);
	}

}
