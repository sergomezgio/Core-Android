package com.example.hito;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tv_cita;
    private Button button_siguiente;
    private String[] arr_cita;
    private Random rndm;
    private int indiceCita = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_cita = findViewById(R.id.tv_cita);
        button_siguiente = findViewById(R.id.button_siguiente);

        rndm = new Random();

        arr_cita = new String[]{
                "¿Cada vez que tenga una propuesta tengo que someterme al escrutinio público como si estuviera en ‘Saber y Ganar’, que no me sé la respuesta? ",
                "Dios no me hizo perfecta, y por eso no soy de Vox.",
                "El hombre por sí mismo no es un ser violento, porque el hombre también agrede al hombre.",
                "Tengo claro que este virus, por eso se llama Covid-19, porque es coronavirus-diciembre-19, este virus estaba desde diciembre de 2019 campando a sus anchas por todas partes.",
                "(Los rebrotes de Covid) se están produciendo, entre otras, cosas por el modo de vida que tiene nuestra inmigración en Madrid y por la densidad de población de esos distritos y municipios.",
                "Un día os iréis de vacaciones y cuando volváis Podemos habrá dado la casa a sus amigos okupas."

        };

        button_siguiente.setOnClickListener(v -> setCita());
    }

    private void setCita() {
        int indice = 0;
        do{
            rndm.nextInt(arr_cita.length);
        } while(indice == indiceCita);
        
        indiceCita=indice;
        tv_cita.setText(arr_cita[indice]);
    }

}