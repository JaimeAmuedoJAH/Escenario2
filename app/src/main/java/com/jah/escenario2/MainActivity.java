package com.jah.escenario2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner spLista;
    RadioGroup rgContenido;
    RadioButton rbContenido1, rbContenido2, rbContenido3;
    ArrayAdapter<CharSequence> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spLista = findViewById(R.id.spLista);
        rgContenido = findViewById(R.id.rgContenido);
        rbContenido1 = findViewById(R.id.rbContenido1);
        rbContenido2 = findViewById(R.id.rbContenido2);
        rbContenido3 = findViewById(R.id.rbContenido3);
        spLista = findViewById(R.id.spLista);

        adaptador = ArrayAdapter.createFromResource(this, R.array.spLista, android.R.layout.simple_spinner_dropdown_item);
        spLista.setAdapter(adaptador);



        spLista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cambiarContenido(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void cambiarContenido(int indice) {
        if(indice == 0){
            rbContenido1.setText(getString(R.string.cotenidoDeportes1));
            rbContenido2.setText(getString(R.string.cotenidoDeportes2));
            rbContenido3.setText(getString(R.string.cotenidoDeportes3));

        }else if(indice == 1){
            rbContenido1.setText(getString(R.string.cotenidoCiudades1));
            rbContenido2.setText(getString(R.string.cotenidoCiudades2));
            rbContenido3.setText(getString(R.string.cotenidoCiudades3));

        }else if(indice == 2){
            rbContenido1.setText(getString(R.string.contenidoNombres1));
            rbContenido2.setText(getString(R.string.contenidoNombres2));
            rbContenido3.setText(getString(R.string.contenidoNombres3));
        }

    }
}