package com.factory.method;

public class NotificationFactory{
	
    public static Notification create(CustomerSend type) {
        return switch (type) {
        case EMAIL -> new EmailNotification();
        case SMS -> new SMSNotification();
        case WHATSAPP -> new WhatsAppNotification();
    };
}
}