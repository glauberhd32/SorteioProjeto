package com.glauberhd.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView  textoExibir;
    private Button botaoJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoExibir = findViewById(R.id.txtView);
        botaoJogar = findViewById(R.id.btnJogar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = new Random().nextInt(11);
                textoExibir.setText("numero : "+ x);
            }
        });
    }
}
