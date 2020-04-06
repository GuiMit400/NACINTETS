package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onMostrarM(View view){

        WebView webviewM = findViewById(R.id.webviewM);

        Intent i = new Intent(this, RespostaMagalu.class);

        startActivity(i);
    }

    public void onMostrarN(View view){

        WebView webviewN = findViewById(R.id.webviewN);

        Intent i = new Intent(this, RespostaNetshoes.class);

        startActivity(i);
    }

    public void onMostrarS(View view){

        WebView webviewS = findViewById(R.id.webviewS);

        Intent i = new Intent(this, RespostaSubmarino.class);

        startActivity(i);
    }

    public void onMostrarW(View view){

        WebView webviewW = findViewById(R.id.webviewW);

        Intent i = new Intent(this, RespostaWebMotors.class);

        startActivity(i);
    }


}
