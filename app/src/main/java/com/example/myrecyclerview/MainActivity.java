package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listData;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView) findViewById(R.id.recyclerViewId);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        listData = new ArrayList<String>();

        for (int i = 0; i <= 50; i++) {
            listData.add("Item # " + i + " ");
        }

        Adapter adapter = new Adapter(listData);
        recycler.setAdapter(adapter);
    }

    public void newItem(View view) {

        listData.add("Item # " + listData.size() + " ");

        recycler.getAdapter().notifyItemInserted(listData.size());
        recycler.smoothScrollToPosition(listData.size());
    }
}