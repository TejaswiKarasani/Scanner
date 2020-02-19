package com.example.scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {
    private ZXingScannerView scannerView;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });

    }

    public void scanCode(View view) {

        scannerView = new ZXingScannerView(this);
        scannerView.setResultHandler(new ZXingScannerResultHandler());
        setContentView(scannerView);
        scannerView.startCamera();
    }

    @Override
    protected void onPause() {
        super.onPause();
        scannerView.stopCamera();
    }

    class ZXingScannerResultHandler implements ZXingScannerView.ResultHandler {


        @Override
        public void handleResult(Result result) {

            //String resultCode = result.getText();
            Toast.makeText(MainActivity.this, "Congratuations!!", Toast.LENGTH_LONG).show();
            setContentView(R.layout.activity_main);
            scannerView.stopCamera();
            display();
        }
    }
    private void display() {
        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }


}
