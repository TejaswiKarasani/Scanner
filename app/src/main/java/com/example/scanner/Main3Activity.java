package com.example.scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Main3Activity extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv1 = findViewById(R.id.tv1);
        String id = getIntent().getStringExtra("id");
        int a = Integer.parseInt(getIntent().getStringExtra("id"));
        total=total+a;
        tv1.setText("Wallet contains " + total + " tokens");

            /*switch (count) {
                case 0: {
                    tv1.setVisibility(View.VISIBLE);
                    int a1 = Integer.parseInt(getIntent().getStringExtra("id"));
                    tv1.setText("You have " + a1 + " incentive tokens in your wallet");
                    total = total + a;
                    break;
                }
                case 1: {
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    //int b = Integer.parseInt(getIntent().getStringExtra("id"));
                    total = total + a;
                    tv2.setText("You have " + total + " incentive tokens in your wallet");
                    break;
                }
                case 2: {
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    tv3.setVisibility(View.VISIBLE);
                    //int c = Integer.parseInt(getIntent().getStringExtra("id"));
                    total = total + a;
                    tv3.setText("You have " + total + " incentive tokens in your wallet");
                    break;
                }
                case 3: {
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    tv3.setVisibility(View.VISIBLE);
                    tv4.setVisibility(View.VISIBLE);
                    total = total + a;
                    tv4.setText("You have " + total + " incentive tokens in your wallet");
                    break;
                }
                case 4: {
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    tv3.setVisibility(View.VISIBLE);
                    tv4.setVisibility(View.VISIBLE);
                    tv5.setVisibility(View.VISIBLE);
                    total = total + a;
                    tv5.setText("You have " + total + " incentive tokens in your wallet");
                    break;
                }
            }*/

        }
    }
