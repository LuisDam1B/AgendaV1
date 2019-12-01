package com.example.agendav1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class FragmentContactos extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Persona> datos;
    Adaptador adaptador;
    FloatingActionButton FAB_NuevoContacto;

    public FragmentContactos(ArrayList<Persona> datos) {

        this.datos = datos;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_contactos,container,false);

        adaptador = new Adaptador(datos,getActivity());

        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adaptador);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));


        FAB_NuevoContacto = rootView.findViewById(R.id.FAB_NuevoContacto);
        FAB_NuevoContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"PRUEBA CLICK FAB",Toast.LENGTH_SHORT).show();

                FragmentManager FM = getSu
                FragmentTransaction FT = FM.beginTransaction();

            }
        });


        return rootView;
    }
}
