package com.designpattern.code.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Code {
  public static void main(String[] args) {
	  NotificationFactory notificationFactory = new NotificationFactory();
	  Notification notification = notificationFactory.createNotification("SMS");
	  notification.notifyUser();
	  notification = notificationFactory.createNotification("E-mail");
	  notification.notifyUser();
	  notification = notificationFactory.createNotification("Push");
	  notification.notifyUser();
    }
}
