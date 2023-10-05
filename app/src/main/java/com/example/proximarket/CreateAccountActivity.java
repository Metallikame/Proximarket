package com.example.proximarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.EditText;

public class CreateAccountActivity extends Activity {

    private Button buttonValidate;
    private EditText identifiants;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        buttonValidate = (Button) findViewById(R.id.buttonValidate);
        identifiants = (EditText) findViewById(R.id.identifiants);
        password = (EditText) findViewById(R.id.password);

        buttonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                // Récupérez les informations d'identification saisies par l'utilisateur
                String enteredUsername = identifiants.getText().toString();
                String enteredPassword = password.getText().toString();
                editor.putString("username", enteredUsername); // Entrez l'identifiant saisi ici
                editor.putString("password", enteredPassword); // Entrez le mot de passe saisi ici
                editor.apply();

                Intent mainActivity = new Intent(CreateAccountActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

    }
}
