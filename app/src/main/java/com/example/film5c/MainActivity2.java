package com.example.film5c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
  TextView textView = (TextView) findViewById(R.id.ciao);

    //ImageView imageView = (ImageView) findViewById(R.id.imageView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Bundle nometto = getIntent().getExtras();
        String filmnome = nometto.getString("filmetto");

        //textView.setText(filmnome);

       // Bundle extras = getIntent().getExtras();
        // if (extras != null) {
        // String value = extras.getString("key");

    }
}