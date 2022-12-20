package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_home;
    ArrayList<HomeRvModel> arrayList;
    HomeRecyclerViewAdapter homeRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_home = findViewById(R.id.rv_home);
        rv_home.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        arrayList.add(new HomeRvModel("Hello", "Hiiiiiiiiii....."));
        arrayList.add(new HomeRvModel("Hello", "Hiiiiiiiiii....."));
        arrayList.add(new HomeRvModel("Hello", "Hiiiiiiiiii....."));
        arrayList.add(new HomeRvModel("Hello", "Hiiiiiiiiii....."));

        homeRecyclerViewAdapter = new HomeRecyclerViewAdapter(this, arrayList);
        rv_home.setAdapter(homeRecyclerViewAdapter);

    }
}