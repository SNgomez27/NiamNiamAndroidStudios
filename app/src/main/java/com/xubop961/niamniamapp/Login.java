package com.xubop961.niamniamapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.botonLogIn);
        TextInputLayout inputEmail = findViewById(R.id.inputEmail);
        TextInputLayout inputPassword = findViewById(R.id.inputPassword);

        TextInputEditText emailEditText = findViewById(R.id.LogEmail);
        TextInputEditText passwordEditText = findViewById(R.id.LogPassword);

        SharedPreferences preferences = getSharedPreferences("Usuario", Context.MODE_PRIVATE);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loginUsuario = emailEditText.getText().toString().trim();
                String loginContraseña = passwordEditText.getText().toString().trim();

                String Registeremail = preferences.getString("usasUsuario", "Anonimo");
                String RegisterPassword = preferences.getString("usasContraseña", "Anonimo");

                if (loginUsuario.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Coloca un usuario", Toast.LENGTH_LONG).show();
                } else if (!loginContraseña.equals("examenpmdm")) {
                    Toast.makeText(getApplicationContext(), "Contraseña equivocada", Toast.LENGTH_LONG).show();
                } else {
                    launchActividad();
                }
            }
        });
    }

    public void launchActividad() {
        Intent intent = new Intent(Login.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    ViewPager2 viewPager = findViewById(R.id.vi)
}

