package com.example.film5c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bottone;
    String film[] = {"titanic", "una notte da leoni", "batman", "spiderman"};

    ListView lvfilm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvfilm1 = (ListView)findViewById(R.id.lvfilm);

        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,film);

    lvfilm1.setAdapter(aaFilm);
   bottone = (Button) findViewById(R.id.esci);



   bottone.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Toast.makeText(getApplicationContext(), "stai a usciiiiiii", Toast.LENGTH_SHORT).show();
       }
   });


   lvfilm1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       @Override
       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           String titolo = (String)lvfilm1.getItemAtPosition(position);
           Toast.makeText(getApplicationContext(),titolo, Toast.LENGTH_SHORT).show();
       }
   });

        lvfilm1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position1, long id) {
                Intent idettFilm = new Intent(getApplicationContext(), MainActivity2.class);
              idettFilm.putExtra("filmetto",(String)lvfilm1.getItemAtPosition(position1));
                startActivity(idettFilm);


            } });
    }
}