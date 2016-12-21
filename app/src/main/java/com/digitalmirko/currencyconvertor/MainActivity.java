package com.digitalmirko.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnClicked(View view){

        EditText dollarsTextEdit = (EditText) findViewById(R.id.dollarsTextEdit);


        // testing typed in entry to Toast Message
        Toast.makeText(MainActivity.this, dollarsTextEdit.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}