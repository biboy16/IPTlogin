package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

    }
    public void onLoginClick(View view) {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (isValidLogin(username, password)) {
            // Successful login
            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
            // You can add code to navigate to another activity here.
            Intent intent = new Intent(this, Homepage.class);
            startActivity(intent);
            finish();
        } else {
            // Invalid login
            Toast.makeText(this, "Invalid login. Please try again.", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean isValidLogin(String username, String password) {
        // Implement your authentication logic here.
        // For a basic example, check if the username and password are not empty.
        return !username.isEmpty() && !password.isEmpty();
    }
    public void onSignUpClick(View view) {
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
    }

}
