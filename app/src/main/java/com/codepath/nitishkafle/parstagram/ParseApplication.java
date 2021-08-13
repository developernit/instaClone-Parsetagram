package com.codepath.nitishkafle.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TsHIN8JN6uCI9C3xZJu6cCWMeAZ1cJg0ed9ONRop")
                .clientKey("1rm6Pg22wKOUr31sWatAPPxKEpMZIl5HpYtaxl7R")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
