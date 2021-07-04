package com.example.suggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager2 vpager;
    Integer[] a = {R.drawable.borrar2, R.drawable.fotoborrar};

    PageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vpager = findViewById(R.id.suggyViewer);

        adapter = new PageAdapter(a);

        vpager.setAdapter(adapter);

    }
}