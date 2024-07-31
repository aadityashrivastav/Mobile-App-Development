package com.example.demoproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_one);
        btn2 = findViewById(R.id.btn_two);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setText("Hello Indore");
                Toast.makeText(getApplicationContext(),"This is Demo Message", Toast.LENGTH_SHORT).show();

            }
        });

    }
}