package com.example.LDM_Guia5_HC98I04001;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculadoraActivity extends AppCompatActivity  {

    TextView txtEntrada;
    TextView txtSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            //Se cumple que sea Landscape entonces llamo a mis controles
            Button btnParenIzq = findViewById(R.id.btnParentIzq);
            Button btnParenDer = findViewById(R.id.btnParentDerecho);
            Button btnPunto = findViewById(R.id.btnPunto);
        }
            Button btn0 = findViewById(R.id.btn0);
            Button btn1 = findViewById(R.id.btn1);
            Button btn2 = findViewById(R.id.btn2);
            Button btn3 = findViewById(R.id.btn3);
            Button btn4 = findViewById(R.id.btn4);
            Button btn5 = findViewById(R.id.btn5);
            Button btn6 = findViewById(R.id.btn6);
            Button btn7 = findViewById(R.id.btn7);
            Button btn8 = findViewById(R.id.btn8);
            Button btn9 = findViewById(R.id.btn9);
            Button btnAc = findViewById(R.id.btnAC);
            Button btnDel = findViewById(R.id.btnDEL);
            Button btnIgual = findViewById(R.id.btnIgual);
            Button btnMas = findViewById(R.id.btnMas);
            Button btnMenos = findViewById(R.id.btnMenos);
            Button btnMult = findViewById(R.id.btnMult);
            Button btnDiv = findViewById(R.id.btnDiv);


            txtEntrada = findViewById(R.id.txtEntrada);
            txtSalida = findViewById(R.id.txtSalida);
    }

}