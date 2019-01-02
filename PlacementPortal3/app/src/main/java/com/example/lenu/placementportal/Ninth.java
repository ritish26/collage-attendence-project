package com.example.lenu.placementportal;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ninth extends AppCompatActivity {
    DatabaseHelper mydb;
    Button b1, b2;
    EditText t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        mydb = new DatabaseHelper(this);
        t2 = (EditText) findViewById(R.id.editText2);
        t3 = (EditText) findViewById(R.id.editText3);
        t1 = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button5);
        Adddata();
        viewall();
    }

    public void Adddata() {
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean isInsertedto = mydb.insertdata3(t1.getText().toString(), t2.getText().toString(), t3.getText().toString());
                if (isInsertedto == true)
                    Toast.makeText(Ninth.this, "Data inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Ninth.this, "Data is not inserted", Toast.LENGTH_LONG).show();

            }
        });
    }

    public void viewall() {
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor res = mydb.getAlldata4();
                if (res.getCount() == 0)  // check whether there is value or not
                {
                    showMessage("ERROR!", "NO DATA PRESENT");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Company name: " + res.getString(0) + "\n");
                    buffer.append("About: " + res.getString(1) + "\n");
                    buffer.append("Criteria: " + res.getString(2) + "\n\n");

                }

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