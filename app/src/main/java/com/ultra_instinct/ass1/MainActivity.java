package com.ultra_instinct.ass1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TV;
    Context CONT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CONT=this;
        TV=findViewById(R.id.id1);
        TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CONT,UniversityActivity.class);
                intent.putExtra("message","i am coming from home");
                startActivity(intent);

            }
        });
    }
}
