package com.codepath.nitishkafle.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TsHIN8JN6uCI9C3xZJu6cCWMeAZ1cJg0ed9ONRop")
                .clientKey("1rm6Pg22wKOUr31sWatAPPxKEpMZIl5HpYtaxl7R")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
