//GERARDO INFANZON PICAZO
//INTENT
//INTERFAZ


package com.example.cecyt9.memorynow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtContraEscuela;
    Button entrar;
    String contra = "CECYT-9";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void entra(View view){
        /*String texto = txtContraEscuela.getText().toString();
        if(texto.equals(contra)) {*/
            Intent entrar = new Intent(MainActivity.this, InicioGrupo.class);
            startActivity(entrar);
        /*} else {
            Toast toast1 = Toast.makeText(getApplicationContext(),"Error, vuelve a intentarlo.", Toast.LENGTH_SHORT);
            toast1.show();
        }*/
    }




}
