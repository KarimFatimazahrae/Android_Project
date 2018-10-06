package com.example.vijaysankar.tp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {
    public static Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);

        TextView bonjour = (TextView) findViewById(R.id.bonjour);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        bonjour.setText("Bonjour "+message);

        //Redirection vers la page de connexion
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lancer l'activite Connexion
                Intent intent = new Intent(NewsActivity.this, AccueilActivity.class);
                startActivity(intent);
            }
        });

        //Redirection vers la page de connexion
        Button details = (Button) findViewById(R.id.details);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lancer l'activite Connexion
                Intent intent = new Intent(NewsActivity.this, DetailsActivity.class);
                startActivity(intent);
            }
        });


    }
}
