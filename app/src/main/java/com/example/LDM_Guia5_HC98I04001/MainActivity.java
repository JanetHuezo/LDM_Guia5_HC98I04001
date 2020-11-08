package com.example.LDM_Guia5_HC98I04001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnConver  = findViewById(R.id.btnConver);
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnCalc = findViewById(R.id.btnCalc);
        Button btnDatos = findViewById(R.id.btnDatos);
        btnConver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this,Conversations.class);
                startActivity(mIntent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login = new Intent(MainActivity.this,Login.class);
                startActivity(Login);
            }
        });
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Calc = new Intent(MainActivity.this,CalculadoraActivity.class);
                startActivity(Calc);
            }
        });
        btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bDatos = new Intent(MainActivity.this,MisDatosAcitvity.class);
                startActivity(bDatos);
            }
        });
    }
}