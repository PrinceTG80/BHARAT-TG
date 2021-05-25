package com.example.bharat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ResetPassword_Activity extends AppCompatActivity
{
    private String check = "";



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password_);


        check = getIntent().getStringExtra("check");
    }



//    @Override
//    protected void onStart()
//    {
//        super.onStart();
//
//
//        if (check.equals("settings"))
//        {
//
//        }
//        else if (check.equals("login"))
//        {
//
//        }
//    }
}
