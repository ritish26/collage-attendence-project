package com.example.lenu.placementportal;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    DatabaseHelper mydb;
    Button b1,b2;
    EditText t2,t3,t4,t5,t6,t7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mydb=new DatabaseHelper(this);
        t2=(EditText)findViewById(R.id.e2);
        t3=(EditText)findViewById(R.id.e3);
        t4=(EditText)findViewById(R.id.e4);
        t5=(EditText)findViewById(R.id.e5);
        t6=(EditText)findViewById(R.id.e6);
        t7=(EditText)findViewById(R.id.e7);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button2);
        AddData();


    }

    public void AddData(){
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean isInsertedto=mydb.insertData(t2.getText().toString(),t3.getText().toString(),t4.getText().toString(),t5.getText().toString(),
                        t6.getText().toString(),t7.getText().toString());
                if(isInsertedto==true)
                    Toast.makeText(ThirdActivity.this, "Data inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ThirdActivity.this, "Data is not inserted", Toast.LENGTH_LONG).show();

            }
        });
    }




}
