package com.designpattern.code.code;

public class NotificationFactory {
	public Notification createNotification(String channel) {
		if(channel == null || channel.isEmpty()) {
			return null;
		}
		else if("SMS".equals(channel)) {
			return new SMSNotification();
		} else if("E-mail".equals(channel)) {
			return new EmailNotification();
		} else if("Push".equals(channel)) {
			return new PushNotification();
		} else {
			return null;
		}
		
	}
}
