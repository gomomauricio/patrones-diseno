package com.strategy.two;

public class SmsNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
