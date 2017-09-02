package com.example.adam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView myfirsttextview = (TextView) findViewById(R.id.myFirstTextView);
        final Button button = (Button) findViewById(R.id.myfirstButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myfirsttextview.setText(button.getText());
            }
        });
        final Button button2 = (Button) findViewById(R.id.mySecondButton);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myfirsttextview.setText(button2.getText());
            }
        });

    }

    public void myFuckingButton() {

    }
}
