package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        TextView registerbutton =(TextView) findViewById(R.id.registerButton);

        registerbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //criar uma ação pro botão
            }
        });
    }
}