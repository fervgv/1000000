package com.example.a1000000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    EditText nombreregistro;
    EditText apellidoregistro;
    EditText rutregistro;
    EditText fechanacregistro;
    EditText correoregistro;
    EditText usuarioregistro;
    EditText contraseñaregistro;
    EditText confcontraseñaregistro;
    Button registrarseformulario;
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombreregistro=(EditText) findViewById(R.id.nombreregistro);
        apellidoregistro=(EditText) findViewById(R.id.apellidoregistro);
        rutregistro=(EditText) findViewById(R.id.rutregistro);
        fechanacregistro=(EditText) findViewById(R.id.fechanacregistro);
        correoregistro=(EditText) findViewById(R.id.correoregistro);
        usuarioregistro=(EditText) findViewById(R.id.usuarioregistro);
        contraseñaregistro=(EditText) findViewById(R.id.contraseñaregistro);
        confcontraseñaregistro=(EditText) findViewById(R.id.confcontraseñaregistro);
        registrarseformulario=(Button) findViewById(R.id.registrarseformulario);//CONECTAR CON FRAGMENTO MAPS
        Intent continuar = new Intent(this, home.class);
        registrarseformulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(continuar);
            }
        });

        volver=(Button) findViewById(R.id.volver);
        Intent regresar = new Intent(this, MainActivity.class);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(regresar);

            }
        })
        ;}
}


