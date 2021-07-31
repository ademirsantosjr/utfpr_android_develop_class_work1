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
    }

    public void showFullName(View view) {
        String firstName = editTextFirstName.getText().toString();
        String lastName = editTextLastName.getText().toString();

        Toast.makeText(this, firstName + " " + lastName, Toast.LENGTH_LONG).show();
    }

}