package com.example.a1000000;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<datos> Listdatos = new ArrayList<>();
    private EditText nombreusuario;
    private EditText contraseñausuario;
    private Button registrarse;
    private Button iniciarsesion;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreusuario = findViewById(R.id.nombreusuario);
        contraseñausuario = findViewById(R.id.contraseñausuario);
        registrarse = findViewById(R.id.registrarse);
        iniciarsesion = findViewById(R.id.iniciarsesion);

        inicializarFireBase();
        Listar();

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro = new Intent(MainActivity.this, Registro.class);
                startActivity(registro);
            }
        });

        iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagprincipal = new Intent(MainActivity.this, home.class);
                startActivity(pagprincipal);
            }
        });
    }

    private void inicializarFireBase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    private void Listar() {
        databaseReference.child("datos").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Listdatos.clear(); // Limpiar la lista antes de agregar nuevos datos
                for (DataSnapshot objs : snapshot.getChildren()) {
                    datos d = objs.getValue(datos.class);
                    if (d != null) {
                        Listdatos.add(d);
                    }
                }
                // Aquí puedes actualizar la interfaz de usuario con los datos de la lista si es necesario
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Manejar el error si es necesario
            }
        });
    }
}
