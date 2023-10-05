package com.example.proximarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class ProductsActivity extends Activity {
    private ImageView boeufscore;
    private ImageView laitfermier;
    private ImageView curescore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        boeufscore = (ImageView) findViewById(R.id.boeufscore);
        boeufscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beefActivity = new Intent(ProductsActivity.this, BeefActivity.class);
                startActivity(beefActivity);

            }
        });

        laitfermier = (ImageView) findViewById(R.id.laitfermier);
        laitfermier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent milkActivity = new Intent(ProductsActivity.this, MilkActivity.class);
                startActivity(milkActivity);

            }
        });

        curescore = (ImageView) findViewById(R.id.curescore);
        curescore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cheeseActivity = new Intent(ProductsActivity.this, CheeseActivity.class);
                startActivity(cheeseActivity);

            }
        });
    }
}
