package com.example.detaylirecyclerviewkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<Filmler> filmlerArrayList;
    private FilmAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        Filmler f1 = new Filmler(1,"Django","django",12.99);
        Filmler f2 = new Filmler(2,"Inception","inception",10.99);
        Filmler f3 = new Filmler(3,"Interstelar","interstellar",29.99);
        Filmler f4 = new Filmler(4,"The Hateful Eight","thehatefuleight",5.99);
        Filmler f5 = new Filmler(5,"The Pianist","thepianist",11.99);
        Filmler f6 = new Filmler(6,"Anadoluda","birzamanlaranadoluda",12.99);

        filmlerArrayList = new ArrayList<>();
        filmlerArrayList.add(f1);
        filmlerArrayList.add(f2);
        filmlerArrayList.add(f3);
        filmlerArrayList.add(f4);
        filmlerArrayList.add(f5);
        filmlerArrayList.add(f6);

        adapter = new FilmAdapter(this,filmlerArrayList);

        rv.setAdapter(adapter);


    }
}
