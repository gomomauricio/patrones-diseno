package com.strategy.two;

public class PushNotification  implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando PUSH: " + message);
    }
}
