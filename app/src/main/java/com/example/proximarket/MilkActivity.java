package com.example.proximarket;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MilkActivity extends Activity {
    private RelativeLayout layout_achat;
    private RelativeLayout layout_score;
    private RelativeLayout layout_infos;
    private Button buttonAchat1;
    private Button buttonScore1;
    private Button buttonInfo1;
    private Button buttonAchat2;
    private Button buttonScore2;
    private Button buttonInfo2;
    private Button buttonAchat3;
    private Button buttonScore3;
    private Button buttonInfo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk);

        layout_achat = (RelativeLayout) findViewById(R.id.layout_achat);
        layout_score = (RelativeLayout) findViewById(R.id.layout_score);
        layout_infos = (RelativeLayout) findViewById(R.id.layout_infos);
        buttonAchat1 = (Button) findViewById(R.id.buttonAchat1);
        buttonScore1 = (Button) findViewById(R.id.buttonScore1);
        buttonInfo1 = (Button) findViewById(R.id.buttonInfo1);
        buttonAchat2 = (Button) findViewById(R.id.buttonAchat2);
        buttonScore2 = (Button) findViewById(R.id.buttonScore2);
        buttonInfo2 = (Button) findViewById(R.id.buttonInfo2);
        buttonAchat3 = (Button) findViewById(R.id.buttonAchat3);
        buttonScore3 = (Button) findViewById(R.id.buttonScore3);
        buttonInfo3 = (Button) findViewById(R.id.buttonInfo3);


        buttonAchat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Achat cliqué");
                layout_achat.setVisibility(View.VISIBLE); // Afficher la vue
                layout_score.setVisibility(View.GONE); // Masquer la vue
                layout_infos.setVisibility(View.GONE); // Masquer la vue
            }
        });

        buttonScore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Score cliqué");
                layout_achat.setVisibility(View.GONE); // Masquer la vue
                layout_score.setVisibility(View.VISIBLE); // Afficher la vue
                layout_infos.setVisibility(View.GONE); // Masquer la vue
            }
        });

        buttonInfo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Info cliqué");
                layout_achat.setVisibility(View.GONE); // Masquer la vue
                layout_score.setVisibility(View.GONE); // Masquer la vue
                layout_infos.setVisibility(View.VISIBLE); // Afficher la vue
            }
        });
        buttonAchat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Achat cliqué");
                layout_achat.setVisibility(View.VISIBLE); // Afficher la vue
                layout_score.setVisibility(View.GONE); // Masquer la vue
                layout_infos.setVisibility(View.GONE); // Masquer la vue
            }
        });

        buttonScore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Score cliqué");
                layout_achat.setVisibility(View.GONE); // Masquer la vue
                layout_score.setVisibility(View.VISIBLE); // Afficher la vue
                layout_infos.setVisibility(View.GONE); // Masquer la vue
            }
        });

        buttonInfo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Info cliqué");
                layout_achat.setVisibility(View.GONE); // Masquer la vue
                layout_score.setVisibility(View.GONE); // Masquer la vue
                layout_infos.setVisibility(View.VISIBLE); // Afficher la vue
            }
        });
        buttonAchat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Achat cliqué");
                layout_achat.setVisibility(View.VISIBLE); // Afficher la vue
                layout_score.setVisibility(View.GONE); // Masquer la vue
                layout_infos.setVisibility(View.GONE); // Masquer la vue
            }
        });

        buttonScore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Score cliqué");
                layout_achat.setVisibility(View.GONE); // Masquer la vue
                layout_score.setVisibility(View.VISIBLE); // Afficher la vue
                layout_infos.setVisibility(View.GONE); // Masquer la vue
            }
        });

        buttonInfo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Info cliqué");
                layout_achat.setVisibility(View.GONE); // Masquer la vue
                layout_score.setVisibility(View.GONE); // Masquer la vue
                layout_infos.setVisibility(View.VISIBLE); // Afficher la vue
            }
        });
    }
}
