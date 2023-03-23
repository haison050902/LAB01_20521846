package com.example.lamlailab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv1;
    ListView lv2;
    ListView lv3;

    String listView[] = {"Item1"};
    String listView1[] = {"Item2"};
    String listView2[] = {"Item3"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv1 = (ListView) findViewById(R.id.listViewId);
        lv2 = (ListView) findViewById(R.id.listViewId1);
        lv3 = (ListView) findViewById(R.id.listViewId2);


        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                listView);

        ArrayAdapter adapter1 = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                listView1);

        ArrayAdapter adapter2 = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                listView2);


        lv1.setAdapter(adapter);
        lv2.setAdapter(adapter1);
        lv3.setAdapter(adapter2);
    }
}