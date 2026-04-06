package com.factory.method;

public class WhatsAppNotification implements Notification {
    public void send(String message) {
        System.out.println("WhatsApp: " + message);
    }
}
