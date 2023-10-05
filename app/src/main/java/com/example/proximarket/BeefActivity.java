package com.example.proximarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BeefActivity extends Activity {

    private Button buttonAchat;
    private Button button3;
    private Button button4;
    private RelativeLayout layout_achat;
    private RelativeLayout layout_score;
    private RelativeLayout layout_infos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef);

        buttonAchat = (Button) findViewById(R.id.buttonAchat);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        layout_achat = (RelativeLayout) findViewById(R.id.layout_achat);
        layout_score = (RelativeLayout) findViewById(R.id.layout_score);
        layout_infos = (RelativeLayout) findViewById(R.id.layout_infos);


        buttonAchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_achat.setVisibility(View.VISIBLE); // Masquer la vue
                layout_score.setVisibility(View.GONE); // Afficher la vue
                layout_infos.setVisibility(View.GONE); // Afficher la vue
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_achat.setVisibility(View.GONE); // Masquer la vue
                layout_score.setVisibility(View.VISIBLE); // Afficher la vue
                layout_infos.setVisibility(View.GONE); // Afficher la vue
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_achat.setVisibility(View.GONE); // Masquer la vue
                layout_score.setVisibility(View.GONE); // Afficher la vue
                layout_infos.setVisibility(View.VISIBLE); // Afficher la vue
            }
        });
    }
}
