package com.example.actividad2;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.actividad1.R;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etp; //Creamos dos objetos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText)findViewById(R.id.txt_nombre);
        etp = (EditText)findViewById(R.id.txt_password);
    // Creamos estos dos metodos para unir la parte logica de la parte gráfica, comunicando los dos elementos
    }
    //Metodo para el botón
    public void Registrar(View view){

        String nombre = etn.getText().toString();//Para guardar lo ingresado en el campo usuario
        String password = etp.getText().toString();// Para guardar los datos ingresados en el campo contraseña

        if(nombre.length() == 0){
        Toast.makeText( this, "Debes de ingresar un usuario", Toast.LENGTH_LONG).show();
        }
        if(password.length() == 0) {
            Toast.makeText(this, "Debes de ingresar una contraseña", Toast.LENGTH_LONG).show();

        }

        if (password.length() >= 8) {

            if(nombre.length() != 0 && password.length() != 0){
                Toast.makeText( this, "Registro en proceso...", Toast.LENGTH_LONG).show();

                Intent registro = new Intent(this, MainActivity2.class);
                startActivity(registro);
            }
        } else {
            Toast.makeText(this, "Mínimo de 8 carácteres para la contraseña", Toast.LENGTH_LONG).show();
        }
    }
    public void ir (View view){
        Intent ir = new Intent(this, MainActivity2.class);
        startActivity(ir);

    }
}