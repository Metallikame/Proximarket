package com.example.proximarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class ProductsActivity extends Activity {
    private ImageView boeufscore;
    private ImageView laitfermier;
    private ImageView curescore;
    private Button buttonMyProduct1;
    private Button buttonMyProduct2;
    private Button buttonMyProfil1;
    private Button buttonMyProfil2;
    private RelativeLayout layout_products;
    private RelativeLayout layout_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        layout_products = (RelativeLayout) findViewById(R.id.layout_products);
        layout_profile = (RelativeLayout) findViewById(R.id.layout_profile);
        buttonMyProduct1 = (Button) findViewById(R.id.buttonMyProduct1);
        buttonMyProduct2 = (Button) findViewById(R.id.buttonMyProduct2);
        buttonMyProfil1 = (Button) findViewById(R.id.buttonMyProfil1);
        buttonMyProfil2 = (Button) findViewById(R.id.buttonMyProfil2);

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

        buttonMyProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Produits cliqué");
                layout_products.setVisibility(View.VISIBLE); // Afficher la vue
                layout_profile.setVisibility(View.GONE); // Masquer la vue

            }
        });
        buttonMyProfil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Produits cliqué");
                layout_products.setVisibility(View.GONE); // Afficher la vue
                layout_profile.setVisibility(View.VISIBLE); // Masquer la vue

            }
        });
        buttonMyProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Produits cliqué");
                layout_products.setVisibility(View.VISIBLE); // Afficher la vue
                layout_profile.setVisibility(View.GONE); // Masquer la vue

            }
        });
        buttonMyProfil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Clic", "Button Produits cliqué");
                layout_products.setVisibility(View.GONE); // Afficher la vue
                layout_profile.setVisibility(View.VISIBLE); // Masquer la vue

            }
        });
    }
}
