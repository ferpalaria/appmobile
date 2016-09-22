package com.br.fpalaria.aprendendoiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void logando(View view) {
        final int result = 1;
        Intent entrar = new Intent(this, Modulos.class);
        entrar.putExtra("callingActivity", "Login");
        startActivityForResult(entrar,result);
    }


}
