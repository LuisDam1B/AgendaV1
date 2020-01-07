package com.example.agendav1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class  Adaptador extends RecyclerView.Adapter implements View.OnClickListener {

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.linear_recicleview_agenda,parent,false);

        view.setOnClickListener(this);
        Holder holder = new Holder(view,context);



        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((Holder)holder).binHolder(datos.get(position));

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void setListenerClick(View.OnClickListener listenerClick){
        if (listenerClick != null){
            this.listenerClick = listenerClick;
        }
    }

    @Override
    public void onClick(View view) {
        if (listenerClick != null) listenerClick.onClick(view);
    }
}

class Holder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    ImageView imagenPerfil;
    TextView nombre;
    TextView apellidos;
    TextView telefono;
    TextView email;

    Persona persona;
    IUsuario listener;
    Context context;

    public Holder(@NonNull View itemView, Context context)
    {
        super(itemView);

        imagenPerfil = itemView.findViewById(R.id.imagenPerfil);
        nombre = itemView.findViewById(R.id.tvNombre);
        apellidos = itemView.findViewById(R.id.tvApellidos);
        telefono = itemView.findViewById(R.id.tvTelefono);
        email = itemView.findViewById(R.id.tvEmail);
        this.context = context;
    }

    public void binHolder(Persona persona){
        this.persona = persona;
        nombre.setText(persona.getNombre());
        apellidos.setText(persona.getApellidos());
        telefono.setText(String.valueOf(persona.getTelefono()));
        email.setText(persona.getEmail());
        //imagenPerfil.setImageBitmap((Bitmap) persona.getForoPerfil());
    }


    @Override
    public void onClick(View v) {
        if (listener != null){
            listener.clickPersona(persona);
        }

    }
}