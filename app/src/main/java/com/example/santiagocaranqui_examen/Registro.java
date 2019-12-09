package com.example.santiagocaranqui_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {


    Button guardar;
    EditText nombre;
    EditText monto;
    EditText pago;
    TextView msj;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        msj= findViewById(R.id.lbl_usuario1);
        guardar= findViewById(R.id.btn_guardar);
        nombre = findViewById(R.id.txt_nombre);
        monto = findViewById(R.id.txt_montoinicial);
        pago= findViewById(R.id.txt_pagomensual);

        Bundle miBundle=this.getIntent().getExtras();
        String usuario= miBundle.getString("usuario");
        msj.setText("Bienvenido"+usuario);
    }

    public void guardarDatos (View v)
    {
       Intent miIntent= new Intent(Registro.this,Resumen.class);

        Bundle miBundle= new Bundle();
        miBundle.putString("nombre",nombre.getText().toString());
        miBundle.putString("monto",monto.getText().toString());
        miBundle.putString("pago",pago.getText().toString());
        miBundle.putString("usuario",msj.toString());
        miIntent.putExtras(miBundle);

        startActivity(miIntent);

    }
}
