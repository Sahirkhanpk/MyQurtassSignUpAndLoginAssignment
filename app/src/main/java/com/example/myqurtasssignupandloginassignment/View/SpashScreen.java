package com.example.myqurtasssignupandloginassignment.View;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myqurtasssignupandloginassignment.R;


public class SpashScreen extends AppCompatActivity implements Runnable{
    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {


        try{

            thread.sleep(1500);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Intent intent = new Intent(SpashScreen.this, LoginActivity.class);
        //Intent intent = new Intent(SplashScreen.this, Farm_E.class);
        startActivity(intent);
        finish();

    }
}
