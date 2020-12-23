package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class EditProfile extends AppCompatActivity {

    Switch switch1;
    TextView statuscient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        statuscient = findViewById(R.id.statuscient);
        switch1 = findViewById(R.id.switch1);
        switch1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (switch1.isChecked()){
                    statuscient.setAlpha(1);
                }else{
                    statuscient.setAlpha(0);
                }
            }
        });
    }
}