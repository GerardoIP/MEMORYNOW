//GERARDO INFANZON PICAZO
//INTENT
//INTERFAZ

package com.example.cecyt9.memorynow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class InicioGrupo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_grupo);
    }

    public void siguienteA(View view){
        Intent alumno = new Intent(InicioGrupo.this, inicioAlumno.class);
        startActivity(alumno);
    }


}
