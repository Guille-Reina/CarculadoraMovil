package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.actividad1.R;

public class MainActivity4 extends AppCompatActivity {

    private Spinner spinner1;
    private EditText number1, number2;


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
        setContentView(R.layout.activity_main4);

        number1 = (EditText)findViewById(R.id.txt_number3);
        number2 = (EditText) findViewById(R.id.txt_number4);
        spinner1 = (Spinner) findViewById(R.id.spinner);

        String [] opciones = {"Suma", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter <String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    public void Calcular(View view) {
        Intent i = new Intent(MainActivity4.this, MainActivity5.class);
        Bundle bundle = new Bundle();
        String valor1_String = number1.getText().toString();
        String valor2_String = number2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String seleccion = spinner1.getSelectedItem().toString();
        if (seleccion.equals("Sumar")) {
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            bundle.putString("dato", resultado);
            i.putExtras(bundle);
        } else if (seleccion.equals("Restar")) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            bundle.putString("dato", resultado);
            i.putExtras(bundle);
        } else if (seleccion.equals("Multiplicar")) {
            int multiplicar = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicar);
            bundle.putString("dato", resultado);
            i.putExtras(bundle);
        } else if (seleccion.equals("Dividir")) {
            if (valor1_int != 0) {
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
        public void volver (View view){
            Intent volver = new Intent(this, MainActivity2.class);
            startActivity(volver);

        }

}