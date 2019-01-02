package com.example.lenu.placementportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button button_sbm;
    private static Button button_sbm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
        OnClickButtonListener1();
    }

    public void OnClickButtonListener() {
        button_sbm = (Button)findViewById(R.id.button2);
        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.lenu.placementportal.SecondActivity");
                startActivity(intent);
            }
        });
    }
    public void OnClickButtonListener1() {
        button_sbm1 = (Button)findViewById(R.id.button1);
        button_sbm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.lenu.placementportal.fourthActivity");
                startActivity(intent);
            }
        });
    }
}