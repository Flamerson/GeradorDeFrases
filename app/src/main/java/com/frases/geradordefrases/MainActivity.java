package com.frases.geradordefrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frases;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);

        FrasesMotivationais f = new FrasesMotivationais(); // chama a lista de array que está no objeto FrasesMotivacionais

        getSupportActionBar().hide();  // Aqui esconde a action bar, aquela que fica acima no app.

        gerarFrases.setOnClickListener(view -> {
            Random random = new Random();
            int n = random.nextInt(f.frasesMotivacionais.length);

            frases.setText(f.frasesMotivacionais[n]);
        });

    }
}