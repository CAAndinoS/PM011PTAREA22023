package com.example.pm011ptarea22023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {
    TextView textViewNombreCompleto, textViewEdad, textViewCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        textViewNombreCompleto = findViewById(R.id.textViewNombreCompleto);
        textViewEdad = findViewById(R.id.textViewEdad);
        textViewCorreo = findViewById(R.id.textViewCorreo);

        Intent intent = getIntent();

        String nombre = intent.getStringExtra("nombre");
        String apellidos = intent.getStringExtra("apellidos");
        int edad = intent.getIntExtra("edad", 0);
        String correo = intent.getStringExtra("correo");

        textViewNombreCompleto.setText(nombre + " " + apellidos);
        textViewEdad.setText("Edad: " + String.valueOf(edad));
        textViewCorreo.setText("Correo electrónico: " + correo);
    }
}