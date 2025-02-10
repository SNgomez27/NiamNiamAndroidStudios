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

import com.google.android.material.textfield.TextInputLayout;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        TextInputLayout user = findViewById(R.id.registerUsername);
        TextInputLayout Registeremail = findViewById(R.id.registerEmail);
        TextInputLayout RegisterPassword = findViewById(R.id.registerContra);
        TextInputLayout RegisterRepitPassword = findViewById(R.id.registerContraRepit);
        Button RegisterButton = findViewById(R.id.botonRegist);

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String useUsuario = String.valueOf(user.getEditText().getText());
                String usePassword = String.valueOf(user.getEditText().getText());
                String useRepitPassword = String.valueOf(user.getEditText().getText());

                if (!usePassword.equals(useRepitPassword)){
                    Toast toastContra = Toast.makeText(getApplicationContext(),"La contraseña no coincide",Toast.LENGTH_LONG);
                    toastContra.show();
                } else if (useUsuario.equals("")) {
                    Toast toastUser = Toast.makeText(getApplicationContext(),"Coloca un nombre de usuario",Toast.LENGTH_LONG);
                    toastUser.show();
                }else{
                    Toast confirmado = Toast.makeText(getApplicationContext(),"Te has registrado con exito",Toast.LENGTH_SHORT);
                    confirmado.show();
                    SharedPreferences preferences = getSharedPreferences("Usuario", Context.MODE_PRIVATE;
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("useUsuario", useUsuario);
                    editor.putString("usePassword", usePassword);
                    editor.putString("useRepitPassword",useRepitPassword);
                    editor.apply();
                    launchActividad();
                }
            }
        });
    }
    public void launchActividad(){
        Intent intent = new Intent(Register.this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
