package com.example.a1000000;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private list <datos> Listdatos= new ArrayList<datos>();
    ArrayAdapter<datos> Arrayadapterdatos;
    EditText nombreusuario;
    EditText contraseñausuario ;
    Button registrarse;
    Button iniciarsesion;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombreusuario = (EditText) findViewById(R.id.nombreusuario);
        contraseñausuario = (EditText) findViewById(R.id.contraseñausuario);
        registrarse = (Button) findViewById(R.id.registrarse);
        inicializarFireBase();
        Listar();

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

    private void  Listar() {
        databaseReference.child("datos").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listardatos.clear();

                for ( DataSnapshot objs: snapshot.getChildren()) {
                    datos d = objs.getValue(datos.class);
                    Listdatos.add(d);
                    Arrayadapterdatos = new adapter <datos>(MainActivity.this, android.R.layout.simple_expandable_list_item_1);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        private void inicializarFireBase() {
            FirebaseApp.initializeApp(context.this);
            firebaseDatabase= FirebaseDatabase.getInstance();
            databaseReference = firebaseDatabase.getReference();

        }

    }

