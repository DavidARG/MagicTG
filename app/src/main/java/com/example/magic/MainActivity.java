package com.example.magic;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardAdapter adapter;
    private List<Card> cardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(R.style.Theme_Magic);
        initViews();
        initValues();
    }

    private void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        cardList = getItems();
        adapter = new CardAdapter(this, cardList);
        recyclerView.setAdapter(adapter);
    }

    private List<Card> getItems(){
        List<Card> itemLists = new ArrayList<>();
        itemLists.add(new Card(getResources().getString(R.string.carta1), getResources().getString(R.string.descripcion1), R.drawable.ragavan));
        itemLists.add(new Card(getResources().getString(R.string.carta2), getResources().getString(R.string.descripcion2), R.drawable.alrund));
        itemLists.add(new Card(getResources().getString(R.string.carta3), getResources().getString(R.string.descripcion3), R.drawable.murktide));
        itemLists.add(new Card(getResources().getString(R.string.carta4), getResources().getString(R.string.descripcion4), R.drawable.goldspan));
        itemLists.add(new Card(getResources().getString(R.string.carta5), getResources().getString(R.string.descripcion5), R.drawable.expressive));
        return itemLists;
    }

}