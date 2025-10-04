package com.example.experiment2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMenu = findViewById(R.id.btnMenu);
        Button btnCalc = findViewById(R.id.btnCalc);
        Button btnTravel = findViewById(R.id.btnTravel);
        Button btnGrid = findViewById(R.id.btnGrid);

        btnMenu.setOnClickListener(v -> startActivity(new Intent(this, MenuActivity.class)));
        btnCalc.setOnClickListener(v -> startActivity(new Intent(this, CalculatorActivity.class)));
        btnTravel.setOnClickListener(v -> startActivity(new Intent(this, TravelActivity.class)));
        btnGrid.setOnClickListener(v -> startActivity(new Intent(this, GridLinearActivity.class)));
    }
}
