package com.example.agendav1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter implements View.OnClickListener {

    ArrayList<Persona> datos;
    View.OnClickListener listenerClick;
    Context context;
    IUsuario listenerImagen;

    public Adaptador(ArrayList<Persona> datos, Context context) {
        this.datos = datos;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.agenda,parent,false);

        view.setOnClickListener(this);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClick(View v) {

    }
}

class Holder extends RecyclerView.ViewHolder implements View.OnClickListener
{

    public Holder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void onClick(View v) {

    }
}