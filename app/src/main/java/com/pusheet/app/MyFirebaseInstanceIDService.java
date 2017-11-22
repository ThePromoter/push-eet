package com.pusheet.app;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by thepromoter on 11/21/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    @Override public void onCreate() {
        super.onCreate();

        String myToken = FirebaseInstanceId.getInstance().getToken();
        writeTokenToFirebase(myToken);
    }

    @Override public void onTokenRefresh() {
        super.onTokenRefresh();

        String myToken = FirebaseInstanceId.getInstance().getToken();
        writeTokenToFirebase(myToken);
    }

    private void writeTokenToFirebase(String token) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference("token");
        reference.setValue(token);
    }
}
