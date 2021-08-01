package com.example.olamundo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
    }

    public void clearFields(View view) {
        editTextFirstName.setText(null);
        editTextLastName.setText(null);

        editTextFirstName.requestFocus();

        Toast.makeText(this, R.string.cleared_input_fields, Toast.LENGTH_SHORT).show();
    }

    public void showFullName(View view) {
        String firstName = editTextFirstName.getText().toString();
        String lastName = editTextLastName.getText().toString();

        if (firstName == null || firstName.trim().isEmpty()) {
            Toast.makeText(this, R.string.first_name_error, Toast.LENGTH_SHORT).show();
            editTextFirstName.requestFocus();
            return;
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            Toast.makeText(this, R.string.last_name_error, Toast.LENGTH_SHORT).show();
            editTextLastName.requestFocus();
            return;
        }

        Toast.makeText(this,
                firstName.trim() + " " + lastName.trim(),
                Toast.LENGTH_LONG).show();
    }

}