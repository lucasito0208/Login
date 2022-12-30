package com.example.entregable3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.entregable3.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsuario, txtContraseña;
    Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtContraseña = findViewById(R.id.txtContraseña);
        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Necesito una comparacion cuando le de click
                String user = txtUsuario.getText().toString();
                String pass = txtContraseña.getText().toString();

                if(pass.equals("123456") && !user.equals("")){
                    Intent intent1 = new Intent(getApplicationContext(), PrincipalActivity.class);
                    startActivity(intent1);
                }else{
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña erroneos!!!", Toast.LENGTH_LONG).show();
                }
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent2 = getIntent();
        String message = intent2.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.text1);
        textView.setText(message);


    }




}