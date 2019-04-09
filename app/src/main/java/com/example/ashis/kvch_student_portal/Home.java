package com.example.ashis.kvch_student_portal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    private SharedPreferences preferences;
    private String keyemail, keypass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        preferences = getSharedPreferences("mydb",MODE_PRIVATE);
        keyemail = preferences.getString("keyname","na");
        keypass = preferences.getString("keypass","na");

        if (keyemail.equals("na") || keypass.equals("na"))
        {
            startActivity(new Intent(Home.this,login.class));
        }

    }
}
