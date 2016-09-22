package com.br.fpalaria.aprendendoiot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Modulos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulos);

    }


    public void m1(View view) {
        Intent m1 = new Intent(this, Topicos.class);

        final int result = 1;

        m1.putExtra("callingActivity", "Topicos");
        startActivityForResult(m1,result);

    }

    public void block(View view) {
    }




}
