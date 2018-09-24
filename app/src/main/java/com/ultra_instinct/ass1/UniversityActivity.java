package com.ultra_instinct.ass1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UniversityActivity extends AppCompatActivity {

    TextView UNI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        UNI=findViewById(R.id.id2);
        Intent intent=getIntent();
        if(intent!=null)
        {
            String message=intent.getStringExtra("message");
            UNI.setText(message);
        }

    }
}
