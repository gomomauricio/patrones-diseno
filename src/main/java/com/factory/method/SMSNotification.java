package com.factory.method;

public class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}