package com.bida.shop.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class Bot extends TelegramLongPollingBot{

    @Value(value = "${bot.token}")
    private String botToken;
    @Value(value = "${bot.name}")
    private String botName;


    @Override
    public synchronized void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getChatId());
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public String getBotUsername() {
        return botName;
    }

    public void sendMessage(String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(-421514676L)
                .setText(text);
        try{
            execute(sendMessage);
        } catch (Exception e){}
    }
}
