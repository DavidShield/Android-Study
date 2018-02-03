package com.shield.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText amountOfMoney = (EditText) findViewById(R.id.amountOfMoney);

        Log.i("Info", amountOfMoney.getText().toString());

        double amount = 6.2 * Double.valueOf(amountOfMoney.getText().toString());

        Toast.makeText(MainActivity.this, "¥" + String.format("%.2f", amount), Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
