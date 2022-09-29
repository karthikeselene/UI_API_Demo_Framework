package com.dependency.injection;

public class SMSNotification extends Notifications {
	
	public void sendMessage() {
		System.out.println("Sending Message in SMS to customers");
	}

}
