package com.xubop961.niamniamapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        Button BotonLogin = findViewById(R.id.botonLogIn);
        TextInputLayout LoginEmail = findViewById(R.id.LogEmail);
        TextInputLayout LoginPassword = findViewById(R.id.LogPassword);
        SharedPreferences preferences = getSharedPreferences("Usuario", Context.MODE_PRIVATE);
        BotonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loginUsuario = String.valueOf(LoginEmail.getEditText().getText());
                String loginContraseña = String.valueOf(LoginPassword.getEditText().getText());
            }
        });
    }
    }
