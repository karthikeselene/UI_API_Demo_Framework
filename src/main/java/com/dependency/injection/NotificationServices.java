package com.dependency.injection;

public class NotificationServices {
	
	private Notifications notification;
	
	public NotificationServices(Notifications notification) {
		this.notification = notification;
	}
	
	public void send() {
		notification.sendMessage();
	}

}