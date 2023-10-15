package com.example.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class DetailActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_details);
            Intent intent = this.getIntent();
            if (intent != null) {

                String nom = intent.getStringExtra("nom");
                String preparation = intent.getStringExtra("preparation");
                String ingredients = intent.getStringExtra("ingredients");
                int img=intent.getIntExtra("photo",R.drawable.ic_launcher_background);

                String description = intent.getStringExtra("description");

                // Display the receipt details in your layout
                TextView nomView = findViewById(R.id.nom1);
                TextView praparationView = findViewById(R.id.preparation);
                ImageView photoView = findViewById(R.id.photo1);
                TextView ingredientsView = findViewById(R.id.ingredients);
                TextView descriptionView = findViewById(R.id.description);

                nomView.setText(nom);
                praparationView.setText(preparation);
                photoView.setImageResource(img);
                ingredientsView.setText(ingredients);
                descriptionView.setText(description);
            }
        }}


