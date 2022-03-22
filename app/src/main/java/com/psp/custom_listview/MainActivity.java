package com.psp.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ListAdapterTwo adapter;

    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        addItems();

        adapter = new ListAdapterTwo(this,list);
        listView.setAdapter(adapter);

    }


    private void addItems() {
        list.add("Prasad");
        list.add("Ramesh");
        list.add("Suresh");
        list.add("Ankit");
        list.add("Raj");
        list.add("Rohit");
        list.add("Prakash");
        list.add("John");
        list.add("Aniket");
        list.add("Tommy");
        list.add("Guru");
        list.add("Shlok");
        list.add("Prathmesh");
        list.add("Mahesh");
    }
}