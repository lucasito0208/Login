package com.example.entregable3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class RegistroActivity extends AppCompatActivity {

    EditText txtEmail, txtContra, txtUsua;
    AutoCompleteTextView txtAuto;
    RadioButton rbM, rbT;
    TextView matricula;
    Switch sw;
    Button btn4;

    String[] grados = {"DAM1", "DAM2", "DAW1", "DAW2"};
    String estado;

    public static String EXTRA_MESSAGE;
    public static String EXTRA_MESSAGE2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtEmail = findViewById(R.id.txtEmail);
        txtContra = findViewById(R.id.txtContra);
        txtUsua = findViewById(R.id.txtUsuario);
        txtAuto = findViewById(R.id.txtAuto);
        rbM = findViewById(R.id.rbMañanas);
        rbT = findViewById(R.id.rbTardes);
        sw = findViewById(R.id.sw);
        btn4 = findViewById(R.id.btn4);
        matricula = findViewById(R.id.txtMatri);
        grados = getResources().getStringArray(R.array.grados);


        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, grados);

        txtAuto.setThreshold(1);
        txtAuto.setAdapter(ad);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*//Creo un intent
                Intent intent = new Intent(RegistroActivity.this, InfoRegistro.class);
                //Para el correo
                String correo = txtEmail.getText().toString();
                EXTRA_MESSAGE = "Correo del alumno: ";
                intent.putExtra(EXTRA_MESSAGE, correo);
                //Para el usuario
                String usuario = txtUsua.getText().toString();
                EXTRA_MESSAGE2 = "Usuario del alumno: ";
                intent.putExtra(EXTRA_MESSAGE2, usuario);
                //Para el grado
                String grado = txtAuto.getText().toString();
                intent.getDataString();
                startActivity(intent);*/

                Bundle extras = new Bundle();
                Intent intent = new Intent(getApplicationContext(), InfoRegistro.class);
                intent.putExtra("mail", txtEmail.getText().toString());
                intent.putExtra("usuario", txtUsua.getText().toString());
                intent.putExtra("grado", txtAuto.getText().toString());

                if(sw.isChecked()){
                    intent.putExtra("matricula", matricula.getText().toString());
                }else{
                    intent.putExtra("matricula", matricula.getText().toString());
                }

                if(rbM.isChecked()){
                    intent.putExtra("turno", rbM.getText().toString());
                }else if(rbT.isChecked()){
                    intent.putExtra("turno", rbT.getText().toString());
                }


               // intent.putExtras(extras);
                startActivity(intent);
            }
        });

    }


    public void onClick(View view) {
        if(view.getId() == R.id.sw){
            if(sw.isChecked()){
                matricula.setText("Parcial");
            }else{
                matricula.setText("Total");
            }
        }

        if(view.getId() == R.id.radios){
            validar();
        }
    }

    public String validar(){

        estado = null;

        if(rbM.isChecked()){
            estado = "Horario de mañanas";
            return estado;
        }else if(rbT.isChecked()){
            estado = "Horario de tardes";
            return estado;
        }

        return estado;
    }
}