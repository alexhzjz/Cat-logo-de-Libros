package com.example.catalogo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LibroAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", R.drawable.cien_anos_de_soledad));
        libros.add(new Libro("El principito", "Antoine de Saint-Exupéry", R.drawable.el_principito));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", R.drawable.orgullo_y_prejuicio));

        adapter = new LibroAdapter(libros);
        recyclerView.setAdapter(adapter);
    }
}