package com.example.componentesbasicosdois;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Switch botaoAlarme;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoAlarme = findViewById(R.id.switchalarme);
        resultado = findViewById(R.id.Resultado);
    }

    public void enviar(View view) {
        String status;
        if(botaoAlarme.isChecked()){
            status = botaoAlarme.getText().toString();
            resultado.setText("Tocar alarme às " +status);
        }else{
            resultado.setText();
        }
    }
}