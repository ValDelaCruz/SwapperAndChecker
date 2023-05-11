package com.example.swapcheckerdc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    TextView check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //-----------------------DISPLAYING THE RESULT----------------------------
        Intent secondActivity = getIntent();
        check = (TextView) findViewById(R.id.textviewCheckResult);
        String result = secondActivity.getStringExtra("output");
        check.setText(result);
    }
}