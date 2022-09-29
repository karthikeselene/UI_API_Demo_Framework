package com.dependency.injection;

public class EmailNotification extends Notifications {

	public void sendMessage() {		
		System.out.println("Sending Message in email to customers");
	}
	
}