package com.example.pm011ptarea22023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNombre, editTextApellidos, editTextEdad, editTextCorreo;
    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        editTextEdad = findViewById(R.id.editTextEdad);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                procesarDatos();
            }
        });
    }

    private void procesarDatos() {
        String nombre = editTextNombre.getText().toString();
        String apellidos = editTextApellidos.getText().toString();
        int edad = Integer.parseInt(editTextEdad.getText().toString());
        String correo = editTextCorreo.getText().toString();

        Intent intent = new Intent(getApplicationContext(), MostrarDatos.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellidos", apellidos);
        intent.putExtra("edad", edad);
        intent.putExtra("correo", correo);
        startActivity(intent);



    }

}