package com.example.lenu.placementportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthActivity extends AppCompatActivity {

    private static Button button_sbm;
    private static Button button_sbm1;
    private static Button button_sbm2;
    private static Button button_sbm3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        OnClickButtonListener();
       OnClickButtonListener1();
        OnClickButtonListener2();
        OnClickButtonListener3();
    }
    public void OnClickButtonListener() {
        button_sbm = (Button)findViewById(R.id.button4);
        button_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.lenu.placementportal.SixthActivity");
                startActivity(intent);
            }
        });
    }
   public void OnClickButtonListener1() {
        button_sbm1 = (Button)findViewById(R.id.button5);
        button_sbm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.lenu.placementportal.Seven");
                startActivity(intent);
            }
        });
    }
    public void OnClickButtonListener2() {
        button_sbm2 = (Button)findViewById(R.id.button6);
        button_sbm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.lenu.placementportal.Eigth");
                startActivity(intent);
            }
        });
    }
    public void OnClickButtonListener3() {
        button_sbm3 = (Button)findViewById(R.id.button7);
        button_sbm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.lenu.placementportal.Ninth");
                startActivity(intent);
            }
        });
    }
}
