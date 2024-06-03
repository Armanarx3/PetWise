package com.example.petwise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmailPhoneLogin, editTextPasswordLogin;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmailPhoneLogin = findViewById(R.id.editTextEmailPhoneLogin);
        editTextPasswordLogin = findViewById(R.id.editTextPasswordLogin);
        loginButton = findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput()) {
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean validateInput() {
        String emailPhone = editTextEmailPhoneLogin.getText().toString().trim();
        String password = editTextPasswordLogin.getText().toString().trim();

        if (emailPhone.isEmpty()) {
            editTextEmailPhoneLogin.setError("Email/Phone Number is required");
            editTextEmailPhoneLogin.requestFocus();
            return false;
        }

        if (password.isEmpty()) {
            editTextPasswordLogin.setError("Password is required");
            editTextPasswordLogin.requestFocus();
            return false;
        }

        return true;
    }
}
