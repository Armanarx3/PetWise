package com.example.petwise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView veterinary = findViewById(R.id.ic_veterinary);
        ImageView grooming = findViewById(R.id.ic_grooming);
        ImageView training = findViewById(R.id.ic_training);
        ImageView adoption = findViewById(R.id.ic_adoption);


        veterinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, VeterinaryActivity.class);
                startActivity(intent);
            }
        });

        grooming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, GroomingActivity.class);
                startActivity(intent);
            }
        });

        training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TrainingActivity.class);
                startActivity(intent);
            }
        });

        adoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AdoptionActivity.class);
                startActivity(intent);
            }
        });

    }

}


