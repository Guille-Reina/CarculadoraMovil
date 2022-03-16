package com.example.actividad2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.actividad1.R;


public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

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

    public void ir3(View view) {
        Intent ir3 = new Intent(this, MainActivity3.class);
        startActivity(ir3);
    }

    public void ir4(View view) {
        Intent ir4 = new Intent(this, MainActivity4.class);
        startActivity(ir4);
    }

    public void ir6(View view) {
        Intent ir6 = new Intent(this, MainActivity6.class);
        startActivity(ir6);
    }

    public void volver(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }




}