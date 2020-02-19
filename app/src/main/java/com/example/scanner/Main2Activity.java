package com.example.scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    Button button;
    TextView textView;
    final int min = 2;
    final int max = 10;
    final int random = new Random().nextInt((max - min) + 1) + min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        textView.setText("Hey you won " + random + " incentive tokens" );
        final String randomString=String.valueOf(random);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                i.putExtra("id",randomString);
                startActivity(i);
            }
        });


    }
}
