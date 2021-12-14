package com.example.film5c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String film[] = {"titanic", "una notte da leoni", "batman", "spiderman"};

    ListView lvfilm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvfilm1 = (ListView)findViewById(R.id.lvfilm);

        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,film);

    lvfilm1.setAdapter(aaFilm);
    }
}