package com.example.entregable3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context contexto;
    private ArrayList<Asignatura> asignaturas;

    public Adaptador(Context contexto, ArrayList<Asignatura> asignaturas) {
        this.contexto = contexto;
        this.asignaturas = asignaturas;
    }

    @Override
    public int getCount() {
        return asignaturas.size();
    }

    @Override
    public Object getItem(int posicion) {
        return asignaturas.get(posicion);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicion, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(contexto).inflate(R.layout.contenido, null);
        //Creo cada elemento que contiene el contenido
        TextView titulo = convertView.findViewById(R.id.titulo);
        TextView descripcion = convertView.findViewById(R.id.descripcion);
        RadioButton radio = convertView.findViewById(R.id.convalida);

        //Cuantas veces se va a ejecutar este metodo?
        Asignatura asign = (Asignatura) getItem(posicion);

        //Para inflar de datos, necesito un objeto de la clase asignatura
        titulo.setText(asign.getTitulo());
        descripcion.setText(asign.getDescripcion());

        return convertView;
    }
}
