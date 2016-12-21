package com.digitalmirko.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnClicked(View view){

        // U.S. Dollar amount added in by user
        EditText dollarsTextEdit = (EditText) findViewById(R.id.dollarsTextEdit);

        // Currents exchange rate of U.S. Dollars (USD) to British Pounds (GBP) 12.21.2016
        Double poundsUK = Double.parseDouble(dollarsTextEdit.getText().toString())  * 0.809185;

        // testing typed in entry to Toast Message
//        Toast.makeText(MainActivity.this, dollarsTextEdit.getText().toString(), Toast.LENGTH_SHORT).show();

        // Pops up Toast message box with GBP in 2 place decimal format answer
        Toast.makeText(MainActivity.this, String.format("GBP %.2f",poundsUK), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
