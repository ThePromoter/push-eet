package com.pusheet.app;

/**
 * Created by thepromoter on 11/21/17.
 */

public class Identity {

    private String firebaseToken;
    private String deviceId;

    public Identity(String firebaseToken, String deviceId) {
        this.firebaseToken = firebaseToken;
        this.deviceId = deviceId;
    }

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
