package com.example.alfiya.login;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ALFIYA on 16/01/2018.
 */

public class logged extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logged);
        TextView tv= (TextView) findViewById(R.id.textView);
        String s;
        s=GetData();
        tv.setText(s);

    }

    String GetData() {

        DatabaseHelper obj = new DatabaseHelper(logged.this);
        Cursor cursor = obj.SelectUser();
        String s = "";
        while (cursor.moveToNext()) {

            Toast.makeText(logged.this,""+s  ,Toast.LENGTH_SHORT).show();

            s += cursor.getString(1);

        }

        return s;
    }
}
