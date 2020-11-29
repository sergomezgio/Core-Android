package com.example.hito2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.slider.Slider;

public class Relleno2 extends AppCompatActivity {
    private Slider slider;
    private Button end_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relleno2);

        slider = findViewById(R.id.slider);
        end_button = findViewById(R.id.end_button);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("respuesta");

        end_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Relleno2.this,fin.class);
                intent.putExtra("respuesta",msg);
                intent.putExtra("progreso",slider.getValue());
                startActivity(intent);
            }
        });

    }
}