package com.example.a1000000;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class home extends AppCompatActivity {

    private SensorManager mgr;
    private TextView textLista;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mgr=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        textLista =(TextView) findViewById(R.id.listasensor);
        List<Sensor> sensorList=mgr.getSensorList(Sensor.TYPE_ALL);
        StringBuilder stringBuilder= new StringBuilder();
        for (Sensor s: sensorList){
            stringBuilder.append(s.getName());
        }


        textLista.setVisibility(View.VISIBLE);
        textLista.setText(stringBuilder);


    }

    }


