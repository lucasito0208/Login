package com.example.entregable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class InfoRegistro extends AppCompatActivity {

    TextView txtEmail2, txtUsuario2, txtGrado2, txtMatricula, txtTurno;
    Button btnConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_registro);

        btnConfirm = findViewById(R.id.btnConfirm);

        /*Intent intent4 = getIntent();

        String message = intent4.getStringExtra(RegistroActivity.EXTRA_MESSAGE);
        TextView txtEmail2 = findViewById(R.id.txtEmail2);
        txtEmail2.setText(message);

        String message2 = intent4.getStringExtra(RegistroActivity.EXTRA_MESSAGE2);
        TextView txtUsuario2 = findViewById(R.id.txtUsuario2);
        txtUsuario2.setText(message2);*/

            String correo = getIntent().getStringExtra("mail");
            txtEmail2 = findViewById(R.id.txtEmail2);
            txtEmail2.setText(correo);

            String usuario = getIntent().getStringExtra("usuario");
            txtUsuario2 = findViewById(R.id.txtUsuario2);
            txtUsuario2.setText(usuario);

            String grado = getIntent().getStringExtra("grado");
            txtGrado2 = findViewById(R.id.txtGrado2);
            txtGrado2.setText(grado);

            String matricula = getIntent().getStringExtra("matricula");
            txtMatricula = findViewById(R.id.txtMatri);
            txtMatricula.setText(matricula);

            String turno = getIntent().getStringExtra("turno");
            txtTurno = findViewById(R.id.txtTurno);
            txtTurno.setText(turno);

            while(!correo.isEmpty() && !usuario.isEmpty() && !grado.isEmpty() && !matricula.isEmpty() && !turno.isEmpty()){
                btnConfirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
                        startActivity(intent);
                    }
                });
            }


    }
}