package com.example.vijaysankar.tp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static Button buttonLogin;
    private EditText login, mdp;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        login = (EditText) findViewById(R.id.loginText);
        mdp = (EditText) findViewById(R.id.mdp);

        //Redirection vers la page inscription
        buttonLogin = (Button) findViewById(R.id.login);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(login.getText())) {
                    Toast.makeText(getApplicationContext(), "Login obligatoire!",
                            Toast.LENGTH_LONG).show();
                    login.setError("login is required!");

                } else if (TextUtils.isEmpty(mdp.getText())) {
                    Toast.makeText(getApplicationContext(), "MDP obligatoire!",
                            Toast.LENGTH_LONG).show();
                    mdp.setError("mdp is required!");
                } else {
                    //Lancer l'activite Inscription
                    Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                    String message = login.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, message);
                    startActivity(intent);
                }
            }
        });

    }
}
