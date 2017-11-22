package com.pusheet.app;

/**
 * Created by thepromoter on 11/21/17.
 */

public class NewNotificationEvent {

    private String notification;

    public NewNotificationEvent(String notification) {
        this.notification = notification;
    }

    public String getNotification() {
        return notification;
    }
}
