package com.example.petwise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class VeterinaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinary);
    }

    public void onBookConsultationClick(View view) {
        Intent intent = new Intent(VeterinaryActivity.this, ConsultationPaymentActivity.class);
        startActivity(intent);
    }
}
