package com.example.increamentanddecrement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button increment, decrement;
            TextView display;
            int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increment = findViewById(R.id.incrementButton);
        decrement = findViewById(R.id.decrementButton);
        display = findViewById(R.id.textView);

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                display.setText(""+count);
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count <= 0) count = 0;
                else count --;
                display.setText(""+count);
            }
        });
    }
}