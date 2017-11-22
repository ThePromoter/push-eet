package com.pusheet.app;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.messaging.RemoteMessage.Notification;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by thepromoter on 11/21/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Notification notification = remoteMessage.getNotification();
        final String message;
        if (notification != null) {
            message = notification.getBody();
        } else {
            message = remoteMessage.getData().get("payload");
        }
        EventBus.getDefault().post(new NewNotificationEvent(message));
    }
}
