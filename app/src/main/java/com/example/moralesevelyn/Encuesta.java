package com.example.moralesevelyn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Encuesta extends AppCompatActivity {

    Button guardar2;
    EditText educativo;
    CheckBox dep1;
    CheckBox dep2;
    CheckBox dep3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        educativo=findViewById(R.id.txt_res1);
        guardar2=findViewById(R.id.btn_guardar2);
        dep1=findViewById(R.id.cb1);
        dep2=findViewById(R.id.cb2);
        dep3=findViewById(R.id.cb3);
    }

    public void guardarEncuesta (View v)
    {
        String cad= "";
        String cad2= "";
        String cad3= "";
        if (dep1.isChecked()==true)
        {
            cad+="¿Por qué eligió este centro?";

        }
        if (dep2.isChecked()==true)
        {
            cad2+="¿Qué deportes practica?";

        }
        if (dep3.isChecked()==true)
        {
            cad3+="Está interesado en aprender otro idioma aparte de inglés.";

        }
        String mensaje= cad+" "+cad2+" "+cad3;
        Intent miIntent2 = new Intent(Encuesta.this,Resumen.class);
        Bundle miBundle2= new Bundle();
        miBundle2.putString("educativo",educativo.getText().toString());
        miBundle2.putString("deportes",mensaje);
        miIntent2.putExtras(miBundle2);
        startActivity(miIntent2);
    }
}
