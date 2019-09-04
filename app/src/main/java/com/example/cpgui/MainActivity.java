package com.example.cpgui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startLogin(View view) {
        Intent intent = new Intent(MainActivity.this, activity_login.class);
        startActivity(intent);
    }

    public void onSignUp(View view) {
        startActivity(new Intent(MainActivity.this,SignUp.class));
    }
}
