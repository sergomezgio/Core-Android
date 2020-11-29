package com.example.hito2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class fin extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("respuesta");

        Bundle bundle = getIntent().getExtras();
        float num = bundle.getFloat("progreso");

        TextView resultados = findViewById(R.id.resultados);
        resultados.setText(msg+" "+num);
    }
}