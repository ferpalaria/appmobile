package com.br.fpalaria.aprendendoiot;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.br.fpalaria.model.LoginModel;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Login extends AppCompatActivity {

    String BASE_URL = "http://ec2-52-67-20-176.sa-east-1.compute.amazonaws.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void logando(View view) {
        final int result = 1;

        RetrofitRequest api;
        String status = "";


        EditText senhaDaView = (EditText) findViewById(R.id.senha);
        String stringSenha = senhaDaView.getText().toString();

        EditText userDaView = (EditText) findViewById(R.id.email);
        String stringUser = userDaView.getText().toString();


        LoginModel send = new LoginModel();

        send.setSenha(stringSenha);
        send.setUsuario(stringUser);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(RetrofitRequest.class);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);



        Call<String> call = api.validaLogin(send.getUsuario(), send.getSenha());

        try {
            status = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (!status.equals("FALHA")){

            Intent entrar = new Intent(this, Modulos.class);
            entrar.putExtra("callingActivity", "LoginModel");
            startActivityForResult(entrar,result);


        } else {
            Toast.makeText(getApplicationContext(), "Login Inválido", Toast.LENGTH_LONG).show();
        }

    }


}
