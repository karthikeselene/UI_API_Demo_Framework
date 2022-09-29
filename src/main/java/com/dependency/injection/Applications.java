package com.dependency.injection;

public class Applications {

	public static void main(String[] args) {		
		NotificationServices notification = new NotificationServices(new EmailNotification());
		notification.send();
		notification = new NotificationServices(new SMSNotification());
		notification.send();
	}

}
