package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Si recibe “” el resultado es 0
    //Si recibe “1” el resultado es 1
    //Si recibe “1,2” el resultado es 3
    //private int calcular(String numeros) {
      //  if(numeros.isEmpty()) {
        //    return 0;
        //}
        //String[] num = numeros.split(",");
        //int sum = 0;
        //for(int i=0; i<num.length; i++) {
        //    sum += Integer.valueOf(num[i]);
        //}
        //return sum;
    //}
}