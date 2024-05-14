package com.dante_frits;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);

      ListView listView = findViewById(R.id. listmenu);

        List<String> list = new ArrayList<>();
        list.add("TIPE DATA DAN HIRARKI");
        list.add("ARRAY DAN POINTER");
        list.add("STRUKTUR");
        list.add("STACK");
        list.add("DOUBLE STACK");
        list.add("LINEAR QUEUE");
        list.add("CIRCULAR QUEUE");
        list.add("DOUBLE ENDED QUEUE.");
        list.add("LINEAR SINGLY LINKED LIST");
        list.add("APLIKASI LINKED LIST UNTUK STACK DAN QUEUE");
        list.add("APLIKASI LINKED LIST UNTUK QUEUE");
        list.add("LINEAR DOUBLY LINKED LIST");
        list.add("LINEAR DOUBLY LINKED LIST PART 2");
        list.add("POHON BINER");

        //ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), R.layout.listviewtext, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(Homepage.this, PDF1.class));
                }
                if (position==1){
                    startActivity(new Intent(Homepage.this, PDF2.class));
                }
                if (position==2){
                    startActivity(new Intent(Homepage.this, PDF3.class));
                }
                if (position==3){
                    startActivity(new Intent(Homepage.this, PDF4.class));
                }
                if (position==4){
                    startActivity(new Intent(Homepage.this, PDF5.class));
                }
                if (position==5){
                    startActivity(new Intent(Homepage.this, PDF6.class));
                }
                if (position==6){
                    startActivity(new Intent(Homepage.this, PDF7.class));
                }
                if (position==7){
                    startActivity(new Intent(Homepage.this, PDF8.class));
                }
                if (position==8){
                    startActivity(new Intent(Homepage.this, PDF9.class));
                }
                if (position==9){
                    startActivity(new Intent(Homepage.this, PDF10.class));
                }
                if (position==10){
                    startActivity(new Intent(Homepage.this, PDF11.class));
                }
                if (position==11){
                    startActivity(new Intent(Homepage.this, PDF12.class));
                }
                if (position==12){
                    startActivity(new Intent(Homepage.this, PDF13.class));
                }
                if (position==13){
                    startActivity(new Intent(Homepage.this, PDF14.class));
                }
            }
        });
    }
}