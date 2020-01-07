package com.example.agendav1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnFABClick{

    final ArrayList<Persona> datos = new ArrayList<>();

    DrawerLayout mDrawerLaout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        mDrawerLaout = findViewById(R.id.drawler_layout);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);

        datos.add(new Persona("Adrian","Gonzalvez Jordan",665200454,"adriangonzalves@gamil.com"));
        datos.add(new Persona("Alberto","Garcia Belenger",665230454,"albertogarcia@gamil.com"));
        datos.add(new Persona("Alejandro","Gonzalvez Jordan",665254353,"alejandorlinare@gamil.com"));
        datos.add(new Persona("Carlos","Linares Muñoz",665234454,"carlosmarin@gamil.com"));
        datos.add(new Persona("David","Collado",665243454,"davidcollado@gamil.com"));
        datos.add(new Persona("Pepe","Pepito flo",665233454,"pepepeito@gamil.com"));
        datos.add(new Persona("Juan","Juanito Sax",665202454,"juanjuanito@gamil.com"));
        datos.add(new Persona("Cristiano","Ronaldo Lima",621334454,"cristianoronaldo@gamil.com"));
        datos.add(new Persona("Leo","Messi Sanz",609480454,"leomessi@gamil.com"));

        FragmentManager FM  = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();

        Fragment fragment = new FragmentContactos(datos);
        FT.replace(R.id.fragment_Container_Contactos,fragment);
        FT.commit();

    }

    @Override
    public void onFABClick() {

        FragmentManager FM  = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();

        Fragment fragmentNuevoContacto = new FragmetNuevoContacto();
        FT.replace(R.id.fragment_Container_Contactos,fragmentNuevoContacto);
        FT.addToBackStack(null);
        FT.commit();

        //Toast.makeText(getApplicationContext(),"Click en FAB desde Actitity",Toast.LENGTH_SHORT).show();

    }


}
