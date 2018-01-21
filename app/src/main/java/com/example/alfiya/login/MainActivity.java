package com.example.alfiya.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                   EditText ed = (EditText) findViewById(R.id.editText);
                EditText ed2 = (EditText) findViewById(R.id.editText2);
                Toast.makeText(MainActivity.this,"1"  ,Toast.LENGTH_SHORT).show();


                    DatabaseHelper obj = new DatabaseHelper(MainActivity.this);
                    obj.InsertUser(ed.getText().toString(), ed2.getText().toString());

                    Toast.makeText(MainActivity.this,"User created"  ,Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,logged.class);
                    startActivity(i);



            }
        });


}
}