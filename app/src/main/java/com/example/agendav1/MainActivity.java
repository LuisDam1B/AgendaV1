package com.example.agendav1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final ArrayList<Persona> datos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_contactos);

        datos.add(new Persona("Adrian","Gonzalvez Jordan",665200454,"adriangonzalves@gamil.com"));
        datos.add(new Persona("Alberto","Garcia Belenger",665230454,"albertogarcia@gamil.com"));
        datos.add(new Persona("Alejandro","Gonzalvez Jordan",665254353,"alejandorlinare@gamil.com"));
        datos.add(new Persona("Carlos","Linares Muñoz",665234454,"carlosmarin@gamil.com"));
        datos.add(new Persona("David","Collado",665243454,"davidcollado@gamil.com"));
        datos.add(new Persona("Pepe","Pepito flo",665233454,"pepepeito@gamil.com"));
        datos.add(new Persona("Juan","Juanito Sax",665202454,"juanjuanito@gamil.com"));
        datos.add(new Persona("Cristiano","Ronaldo Lima",621334454,"cristianoronaldo@gamil.com"));
        datos.add(new Persona("Leo","Messi Sanz",609480454,"leomessi@gamil.com"));


    }
}
