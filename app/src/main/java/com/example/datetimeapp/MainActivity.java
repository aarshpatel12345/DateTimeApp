package com.example.datetimeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView dateTimeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTimeTextView = findViewById(R.id.dateTimeTextView);
        Button updateButton = findViewById(R.id.updateDateTimeButton);

        // Display the current date and time on launch
        updateDateTime();

        // Set up button click listener
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDateTime();
            }
        });
    }

    private void updateDateTime() {
        String currentDateTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault()).format(new Date());
        dateTimeTextView.setText(currentDateTime);
    }
}
