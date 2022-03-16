package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.actividad1.R;

public class MainActivity6 extends AppCompatActivity {

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
        setContentView(R.layout.activity_main6);
    }

    public void amazon (View view){
        Toast.makeText(this, "Amazon fue creado en 1994 por Jeff Bezos", Toast.LENGTH_SHORT).show();
    }
    public void apple (View view){
        Toast.makeText(this, "Apple fue creado en 1976 por Steve Jobs, Steve Wozniak y Ronald Wayne", Toast.LENGTH_SHORT).show();
    }
    public void emule (View view){
        Toast.makeText(this, "Emule fue creado en 2002 por Hendrik Breitkreuz", Toast.LENGTH_SHORT).show();
    }
    public void Discord (View view){
        Toast.makeText(this, "Discord fue creado en 2015 por Jason Citron", Toast.LENGTH_SHORT).show();
    }
    public void vodafone (View view){
        Toast.makeText(this, "Vodafone fue creado en 1982 por Gerry Whent y Ernest Harrison", Toast.LENGTH_SHORT).show();
    }
    public void netflix (View view){
        Toast.makeText(this, "Netflix fue creado en 1997 por Reed Hasting y Marc Randolph", Toast.LENGTH_SHORT).show();
    }
    public void skype (View view){
        Toast.makeText(this, "Skype fue creado en 2003 por Niklas Zennström, Janus Friis y Ahti Heinla", Toast.LENGTH_SHORT).show();
    }
    public void spotify (View view){
        Toast.makeText(this, "Spotify fue creado en 2008 por Daniel Ek Martin Lorentzon", Toast.LENGTH_SHORT).show();
    }
    public void twitter (View view){
        Toast.makeText(this, "Twitter fue creado en 2006 por Jack Dorsey, Biz Stone, Evan Williams y Noah Glass", Toast.LENGTH_SHORT).show();
    }
    public void google (View view){
        Toast.makeText(this, "Google fue creado en 1998 por Larry Page, Serguéi Brin", Toast.LENGTH_SHORT).show();
    }
    public void utorent (View view){
        Toast.makeText(this, "Utorrent fue creado en 2001 por Bram Cohen", Toast.LENGTH_SHORT).show();
    }
    public void whatsapp (View view){
        Toast.makeText(this, "Whatsapp fue creado en 2009 por Jan Koum y Brian Acton", Toast.LENGTH_SHORT).show();
    }
    public void wikipedia (View view){
        Toast.makeText(this, "Wikipedia fue creado en 2001 por Jimmy Donal Wales", Toast.LENGTH_SHORT).show();
    }
    public void youtube (View view){
        Toast.makeText(this, "Youtube fue creado en 2005 por Jawed Karim, Chad Hurley y Steve Chen", Toast.LENGTH_SHORT).show();
    }
    public void dell (View view){
        Toast.makeText(this, "Dell fue creado en 1984 por Michael Dell", Toast.LENGTH_SHORT).show();
    }
    public void colacao (View view){
        Toast.makeText(this, "ColaCao fue creado en 1945 por José María Ventura y José Ignacio Ferrero", Toast.LENGTH_SHORT).show();
    }

    public void volver (View view){
        Intent volver = new Intent(this, MainActivity2.class);
        startActivity(volver);

    }
}