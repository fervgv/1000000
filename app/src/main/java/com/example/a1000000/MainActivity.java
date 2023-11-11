package com.example.a1000000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombreusuario;
    EditText contraseñausuario;
    Button registrarse;
    Button iniciarsesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombreusuario = (EditText) findViewById(R.id.nombreusuario);
        contraseñausuario = (EditText) findViewById(R.id.contraseñausuario);
        registrarse = (Button) findViewById(R.id.registrarse);
        Intent registro = new Intent(this, Registro.class);
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(registro);
            }
        });

        iniciarsesion = (Button) findViewById(R.id.iniciarsesion);
        Intent pagprincipal = new Intent(this,com.example.a1000000.home.class);
        iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(pagprincipal);

            }
        });
    }
}

