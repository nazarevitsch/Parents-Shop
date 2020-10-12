package com.bida.shop.service;

import com.bida.shop.bot.Bot;
import com.bida.shop.domain.OrderFromWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private Bot bot;

    public void sendNotification(OrderFromWeb order){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Замовлення\n");
        stringBuffer.append("Імя: ");
        stringBuffer.append(order.getName() + " " + order.getSurName() + "\n");
        stringBuffer.append("Телефон: ");
        stringBuffer.append(order.getPhoneNumber() + "\n");
        stringBuffer.append("Куди: ");
        stringBuffer.append(order.getRegion() + " " + order.getCity() + "\n");
        stringBuffer.append("Віділення Нової Пошти: ");
        stringBuffer.append(order.getNewPostNumber());
        stringBuffer.append("\n\nТовари:\n");
        int totalPrice = 0;
        for (int i = 0; i < order.getItems().size(); i++){
            stringBuffer.append("-Товар №" + (i + 1) + ":\n");
            stringBuffer.append("--Назва:  ");
            stringBuffer.append(order.getItems().get(i).getName() + "\n");
            stringBuffer.append("--Розмір:  ");
            stringBuffer.append(order.getItems().get(i).getSize() + "\n");
            stringBuffer.append("--Колір:  ");
            stringBuffer.append(order.getItems().get(i).getColorName() + "\n");
            stringBuffer.append("--Кількість:  ");
            stringBuffer.append(order.getItems().get(i).getAmount() + "\n");
            stringBuffer.append("--Ціна:  ");
            stringBuffer.append((order.getItems().get(i).getPrice() * order.getItems().get(i).getAmount())+ "\n");
            totalPrice = totalPrice + order.getItems().get(i).getPrice() * order.getItems().get(i).getAmount();
        }
        stringBuffer.append("\n\nПовна ціна:  ");
        stringBuffer.append(totalPrice);
        bot.sendMessage(stringBuffer.toString());
    }
}
