package com.example.moralesevelyn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button ingresar;
    EditText usuario;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario= findViewById(R.id.txt_usuario);
        pass = findViewById(R.id.txt_password);
        ingresar = findViewById(R.id.btn_ingresar);
    }
    public void funcionLogin (View v)
    {
        String usu,passw;
        usu= usuario.getText().toString();
        passw= pass.getText().toString();

        if (usu == "estudiante2020" && passw == "uisrael2020")
        {
            Intent miIntent= new Intent(MainActivity.this,Registro.class);

            Bundle miBundle= new Bundle();
            miBundle.putString("usuario",usuario.getText().toString());
            miIntent.putExtras(miBundle);

            startActivity(miIntent);
        }else
        {
            Toast.makeText(MainActivity.this, "Error al intentar ingresar", Toast.LENGTH_SHORT).show();
        }
    }
}
