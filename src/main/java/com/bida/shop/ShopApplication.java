package com.bida.shop;

import com.bida.shop.bot.Bot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication(scanBasePackages = {"com.bida.shop"})
public class ShopApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		TelegramBotsApi botapi = new TelegramBotsApi();
		try {
			botapi.registerBot(new Bot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
		SpringApplication.run(ShopApplication.class, args);
	}
}