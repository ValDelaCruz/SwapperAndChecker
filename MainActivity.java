package com.example.swapcheckerdc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//-----------------------------START OF FUNCTIONS----------------------------------------
        btn = (Button) findViewById(R.id.btnCheck);
        editText1 = (EditText) findViewById(R.id.textfield1);
        editText2 = (EditText) findViewById(R.id.textfield2);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                String input1 = editText1.getText().toString();
                String input2 = editText2.getText().toString();
                if (input1.equalsIgnoreCase(input2)) {
                    intent.putExtra("output", "SAME!");
                    startActivity(intent);

                } else {
                    intent.putExtra("output", "NOT THE SAME!");
                    startActivity(intent);
                }
            }
        });
    }
//------------------------------------SWAPPING INPUTS--------------------------------------------
    public void onSwap (View view){
        editText1 = (EditText) findViewById(R.id.textfield1);
        editText2 = (EditText) findViewById(R.id.textfield2);
        String getInput1 = String.valueOf(editText1.getText());
        String getInput2 = String.valueOf(editText2.getText());
        editText1.setText(getInput2);
        editText2.setText(getInput1);
    }
}