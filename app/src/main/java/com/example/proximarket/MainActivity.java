package com.example.proximarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button connexion;
    private Button button4;
    private EditText identifiants;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connexion = (Button) findViewById(R.id.connexion);
        identifiants = (EditText) findViewById(R.id.identifiants);
        password = (EditText) findViewById(R.id.password);

        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Récupérez les informations d'identification saisies par l'utilisateur
                String enteredUsername = identifiants.getText().toString();
                String enteredPassword = password.getText().toString();

                // Récupérez les informations d'identification stockées dans les SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                String storedUsername = sharedPreferences.getString("username", "");
                String storedPassword = sharedPreferences.getString("password", "");

                // Vérifiez les informations d'identification
                if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                    // Connexion réussie, vous pouvez rediriger l'utilisateur vers une autre activité
                    Intent homeActivity = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(homeActivity);
                } else {
                    // Identifiant ou mot de passe incorrect, affichez un message d'erreur
                    Intent mainActivity = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(mainActivity);
                    Toast.makeText(getApplicationContext(), "Identifiant ou mot de passe incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccountActivity = new Intent(MainActivity.this, CreateAccountActivity.class);
                startActivity(createAccountActivity);

            }
        });

    }
}
