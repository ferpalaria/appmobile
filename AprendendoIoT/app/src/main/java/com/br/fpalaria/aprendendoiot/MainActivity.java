package com.br.fpalaria.aprendendoiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent chamarLogin = new Intent(this, Login.class);
        final int result = 1;
        chamarLogin.putExtra("callingActivity", "MainActivity");
        startActivityForResult(chamarLogin,result);
    }
}
