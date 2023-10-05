package com.example.proximarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LocationActivity extends Activity {
    private ImageView imageView2;
    private ImageView search;
    private ImageView laitfermier;
    private ImageView boeufscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        search = (ImageView) findViewById(R.id.search);
        laitfermier = (ImageView) findViewById(R.id.laitfermier);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeActivity = new Intent(LocationActivity.this, HomeActivity.class);
                startActivity(homeActivity);

            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent filtrerActivity = new Intent(LocationActivity.this, FiltrerActivity.class);
                startActivity(filtrerActivity);

            }
        });

        boeufscore = (ImageView) findViewById(R.id.boeufscore);
        boeufscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beefActivity = new Intent(LocationActivity.this, BeefActivity.class);
                startActivity(beefActivity);

            }
        });

        laitfermier = (ImageView) findViewById(R.id.laitfermier);
        laitfermier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent milkActivity = new Intent(LocationActivity.this, MilkActivity.class);
                startActivity(milkActivity);

            }
        });
    }
}
