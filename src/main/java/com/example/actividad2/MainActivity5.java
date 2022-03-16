package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.actividad1.R;

public class MainActivity5 extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tv1 = (TextView)findViewById(R.id.txt_result);
        Bundle bundle = getIntent().getExtras();
        String dato = getIntent().getStringExtra("dato");

        tv1.setText("El resultado de la operacion es: " + dato);


    }

    public void volver(View view) {
        Intent volver = new Intent(this, MainActivity2.class);
        startActivity(volver);

    }
}