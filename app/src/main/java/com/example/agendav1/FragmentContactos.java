package com.example.agendav1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentContactos extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Persona> datos;
    Adaptador adaptador;

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



        return rootView;
    }
}
