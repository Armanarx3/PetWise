package com.example.petwise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class AdoptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoption);

        ImageView catImage1 = findViewById(R.id.catImage1); // Ensure this ID matches your layout
        catImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdoptionActivity.this, AdoptionDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
