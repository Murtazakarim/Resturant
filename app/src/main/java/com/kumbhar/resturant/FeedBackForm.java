package com.kumbhar.resturant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FeedBackForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back_form);
        getSupportActionBar().hide();
    }
}