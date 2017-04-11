//GERARDO INFANZON PICAZO
//INTENT
//INTERFAZ

package com.example.cecyt9.memorynow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class inicioAlumno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_alumno);
    }

    public void menuA(View view){
        Intent actividad = new Intent(inicioAlumno.this, menuActividades.class);
        startActivity(actividad);
    }
}
