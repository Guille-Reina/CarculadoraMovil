package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.actividad1.R;


public class MainActivity3 extends AppCompatActivity {

    private EditText td_number1, td_number2;
    private RadioButton radioButton, radioButton2, radioButton3, radioButton4;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item1){
            return true;
        }else if(id==R.id.item2){
            return true;
        }else if(id==R.id.item3){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        td_number1 = (EditText)findViewById(R.id.txt_number1);
        td_number2 = (EditText)findViewById(R.id.txt_number2);
        radioButton = (RadioButton)findViewById(R.id.radioButton);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton)findViewById(R.id.radioButton4);
    }

    public void Calcular(View view){
        Intent i = new Intent(MainActivity3.this, MainActivity5.class);
        Bundle bundle = new Bundle();
        String valor1_String = td_number1.getText().toString();
        String valor2_String = td_number2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if(radioButton.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            bundle.putString("dato", resultado);
            i.putExtras(bundle);
        }else if(radioButton2.isChecked() == true) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            bundle.putString("dato", resultado);
            i.putExtras(bundle);
        }else if(radioButton3.isChecked() == true) {
            int multiplicar = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicar);
            bundle.putString("dato", resultado);
            i.putExtras(bundle);
        }else if(radioButton4.isChecked() == true) {
            if(valor1_int != 0) {
                int dividir = valor1_int / valor2_int;
                String resultado = String.valueOf(dividir);
                bundle.putString("dato", resultado);
                i.putExtras(bundle);
            } else {
                Toast.makeText(this, "El segundo valor debe ser diferente de cero", Toast.LENGTH_LONG).show();
            }
        }
        startActivity(i);

    }

    public void volver(View view) {
        Intent volver = new Intent(this, MainActivity2.class);
        startActivity(volver);

    }
}