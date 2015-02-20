package com.iniqua.demo2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    /*
    Declarar instancias globales
     */
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar Animes
        List<Match> items = new ArrayList<>();

        items.add(new Match(R.drawable.angel, "Atlético de Madrid", "Almeria", "21 Feb 20:00"));
        items.add(new Match(R.drawable.death, "Hercules", "Hospitalet", "22 Feb 18:00"));
        items.add(new Match(R.drawable.fate, "Espanyol", "Cordoba", "27 Feb 20:45"));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new AnimeAdapter(items);
        recycler.setAdapter(adapter);

    }
}
