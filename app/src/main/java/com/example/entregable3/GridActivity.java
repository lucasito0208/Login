package com.example.entregable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    private GridView gridView;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = findViewById(R.id.gv);
        adaptador = new Adaptador(this, getArrayAsignaturas());
        gridView.setAdapter(adaptador);

        Intent intent = getIntent();
    }

    //Defino un metodo que me devuelve el ArrayList

    private ArrayList<Asignatura> getArrayAsignaturas(){
        ArrayList<Asignatura> listaAsign = new ArrayList<>();
        listaAsign.add(new Asignatura("Lenguaje de Marcas", "Aprenderas HTML, CSS y XML"));
        listaAsign.add(new Asignatura("Programacion", "Aprenderás las bases de programacion en Java"));
        listaAsign.add(new Asignatura("Sistemas Informáticos", "Aprenderas redes y hardware"));
        listaAsign.add(new Asignatura("Bases de Datos", "Aprenderas lenguaje SQL y entidadades relacionales"));
        listaAsign.add(new Asignatura("Porgramacion de servicios y procesos", "Aprenderas a administrar hilos y procesos"));
        listaAsign.add(new Asignatura("Programacion multimedia", "Aprenderas a desarrollar en android"));
        listaAsign.add(new Asignatura("Acceso a datos", "Aprenderas a trabajar con ficheros, y administracion de bases de datos"));
        listaAsign.add(new Asignatura("Desarrollo de interfaces", "Aprenderas a desarrollar interfaces con java"));

        return listaAsign;
    }
}