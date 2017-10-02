package com.walloom.fragex;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        ArriendoFragment fragment = new ArriendoFragment();
        ft.add(R.id.frame, fragment).commit();

    }

    public void cambiar(View view) {
        ft = fm.beginTransaction();
        VentasFragment fragment = new VentasFragment();
        ft.replace(R.id.frame, fragment).commit();


    }
}
