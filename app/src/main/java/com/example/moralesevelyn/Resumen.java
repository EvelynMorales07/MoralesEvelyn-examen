package com.example.moralesevelyn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    TextView usuario;
    TextView nombre;
    TextView educativo;
    TextView deportes;
    TextView ingles;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        usuario= findViewById(R.id.txt_usuariores);
        nombre = findViewById(R.id.txt_nombreres);
        educativo= findViewById(R.id.txt_educativres);
        deportes = findViewById(R.id.txt_deportesres);
        ingles= findViewById(R.id.txt_inglesres);
        Bundle miBundle2=this.getIntent().getExtras();
        Bundle miBundle=this.getIntent().getExtras();
        String usu= miBundle.getString("usuario");
        String nom = miBundle.getString("nombre");
        String educa= miBundle2.getString("educativo");
        String depo= miBundle2.getString("deportes");
        usuario.setText(usu);
        nombre.setText(nom);
        educativo.setText(educa);
        deportes.setText(depo);
    }


}
