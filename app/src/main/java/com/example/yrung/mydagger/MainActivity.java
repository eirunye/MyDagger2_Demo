package com.example.yrung.mydagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    @Inject
//    MyFactory myFactory;

    @Inject
    User1 user1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerMyComponent.create().inject(this);

         DaggerMyDaggerComponent.create().inject(this);
         DaggerMyDaggerComponent.builder().myDaggerModule(new MyDaggerModule()).build().inject(this);


        Log.e("MainActivity", user1.hashCode() + "");

        //6777016
    }
}
