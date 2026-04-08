package com.strategy.two;

public class NotificationService 
{
	private NotificationStrategy strategy;

    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void notify(String message) {
        strategy.send(message);
    }

}
