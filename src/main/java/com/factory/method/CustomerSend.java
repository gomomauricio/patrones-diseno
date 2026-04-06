package com.factory.method;

public enum CustomerSend 
{

    EMAIL {
        public Notification create() {
            return new EmailNotification();
        }
    },
    SMS {
        public Notification create() {
            return new SMSNotification();
        }
    },
    WHATSAPP {
        public Notification create() {
            return new WhatsAppNotification();
        }
    };

    public abstract Notification create();
}