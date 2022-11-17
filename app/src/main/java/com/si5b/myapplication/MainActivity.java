package com.si5b.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPahlawan;
    private ArrayList<modelpahlawan> data =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPahlawan = findViewById(R.id.rv_pahlawan);
        rvPahlawan.setHasFixedSize(true);

        data.addAll(datapahlawan.ambildatapahlawan());
    }

    
    private void tampilDataPahlawan(){
        Adapterpahlawan AP = new Adapterpahlawan(data, MainActivity.this);

        rvPahlawan.setLayoutManager(new LinearLayoutManager(this));
        rvPahlawan.setAdapter(AP);
    }
}