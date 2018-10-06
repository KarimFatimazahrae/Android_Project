package com.example.vijaysankar.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        //Redirection vers la page de connexion
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lancer l'activite Connexion
                Intent intent = new Intent(DetailsActivity.this, AccueilActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
