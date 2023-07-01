package com.example.proyectoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar practica =findViewById(R.id.myToolbar);
        setSupportActionBar(practica);
        getSupportActionBar().setTitle("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.icono1){
            Toast.makeText(getApplicationContext(), "Icono 1", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.icono2){
            Toast.makeText(getApplicationContext(), "Icono 2", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.icono3){
            Toast.makeText(getApplicationContext(), "Icono 3", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.icono4){
            finish();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}