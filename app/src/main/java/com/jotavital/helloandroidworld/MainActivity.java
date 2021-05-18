package com.jotavital.helloandroidworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AlertDialog meuAlerta, meuAlerta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCliqueAqui = (Button) findViewById(R.id.btnCliqueAqui);

        meuAlerta = new AlertDialog.Builder(MainActivity.this).create();
        meuAlerta.setTitle("Meu primeiro alerta");
        meuAlerta.setMessage("Isso foi feito por João Pedro Vital!");

        meuAlerta2 = new AlertDialog.Builder(MainActivity.this).create();
        meuAlerta2.setTitle("Meu segundo alerta");
        meuAlerta2.setMessage("Eu amo Beatriz!");

    }

    public void abreAlerta(View view) {
        meuAlerta.show();
    }

    public void abreAlerta2(View view){
        meuAlerta2.show();
    }
}