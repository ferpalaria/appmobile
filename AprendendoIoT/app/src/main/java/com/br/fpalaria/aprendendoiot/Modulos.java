package com.br.fpalaria.aprendendoiot;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Modulos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulos);


        Resources res = getResources();
        Drawable drawable = res.getDrawable(R.mipmap.ic_flight_black_24dp);

    }
}
