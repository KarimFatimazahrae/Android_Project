package com.example.vijaysankar.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Redirection vers la page connexion
        Button connexion = (Button) findViewById(R.id.connexion);
        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lancer l'activite Inscription
                Intent intent = new Intent(AccueilActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
