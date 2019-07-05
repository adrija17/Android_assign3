package com.example.realm3;
import android.app.Application;
import io.realm.Realm;

public class Realm3DemoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
