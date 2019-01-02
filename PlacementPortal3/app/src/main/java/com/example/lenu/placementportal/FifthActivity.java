package com.example.lenu.placementportal;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FifthActivity extends AppCompatActivity {
    DatabaseHelper mydb;
    Button b1,b2,b3;
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        mydb=new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.t1);
        e2=(EditText)findViewById(R.id.t2);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        viewall();
          view();
        view1();
    }


    public void viewall() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor res = mydb.getAlldata();
                if (res.getCount() == 0)  // check whether there is value or not
                {
                    showMessage("ERROR!", "NO DATA PRESENT");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id:" + res.getString(0) + "\n");
                    buffer.append("Name:" + res.getString(1) + "\n");
                    buffer.append("Rollno:" + res.getString(2) + "\n");
                    buffer.append("Branch:" + res.getString(3) + "\n");
                    buffer.append("Company name:" + res.getString(4) + "\n");
                    buffer.append("Pacakge(lpa):" + res.getString(5) + "\n");
                    buffer.append("Year:" + res.getString(6) + "\n \n \n");


                }
                // show all contact
                showMessage("DATA", buffer.toString());
            }
        });

    }
    public void view() {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dat=e1.getText().toString();
                Cursor res = mydb.getRollno(dat);
                if (res.getCount() == 0)  // check whether there is value or not
                {
                    showMessage("ERROR!", "NO DATA PRESENT");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id: " + res.getString(0) + "\n");
                    buffer.append("Name: "  + res.getString(1) + "\n");
                    buffer.append("Branch:" + res.getString(3) + "\n");
                    buffer.append("company name:" + res.getString(4) + "\n");
                    buffer.append("pacakge(lpa):" + res.getString(5) + "\n");
                    buffer.append("year:" + res.getString(6) + "\n \n \n");


                }
                // show all contact
                showMessage("DATA", buffer.toString());
            }
        });

    }
    public void view1() {
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dat=e2.getText().toString();
                Cursor res = mydb.getYear(dat);
                if (res.getCount() == 0)  // check whether there is value or not
                {
                    showMessage("ERROR!", "NO DATA PRESENT");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id: " + res.getString(0) + "\n");
                    buffer.append("Name: "  + res.getString(1) + "\n");
                    buffer.append("Rollno:" + res.getString(2) + "\n");
                    buffer.append("Branch:" + res.getString(3) + "\n");
                    buffer.append("company name:" + res.getString(4) + "\n");
                    buffer.append("pacakge(lpa):" + res.getString(5) + "\n\n\n");



                }
                // show all contact
                showMessage("DATA", buffer.toString());
            }
        });

    }


    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
        // Toast.makeText(getApplicationContext(),title+Message, Toast.LENGTH_SHORT).show();

    }



}
