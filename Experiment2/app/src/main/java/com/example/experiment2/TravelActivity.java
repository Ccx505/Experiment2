package com.example.experiment2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TravelActivity extends AppCompatActivity {

    // 顶部核心按钮
    private Button buttonDCA, buttonMars;
    private ImageButton buttonSwap;

    // 下方功能按钮
    private Button buttonOneWay, buttonTraveller, buttonDepart;
    private Switch switchOneWay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        // 绑定顶部核心按钮
        buttonDCA = findViewById(R.id.button_dca);
        buttonMars = findViewById(R.id.button_mars);
        buttonSwap = findViewById(R.id.button_swap);

        // 绑定下方功能按钮
        buttonOneWay = findViewById(R.id.button_one_way);
        switchOneWay = findViewById(R.id.switch_one_way);
        buttonTraveller = findViewById(R.id.button_traveller);
        buttonDepart = findViewById(R.id.button_depart);

        // 设置按钮点击事件
        buttonDCA.setOnClickListener(v ->
                Toast.makeText(this, "DCA clicked", Toast.LENGTH_SHORT).show());

        buttonMars.setOnClickListener(v ->
                Toast.makeText(this, "MARS clicked", Toast.LENGTH_SHORT).show());

        buttonSwap.setOnClickListener(v ->
                Toast.makeText(this, "Swap clicked", Toast.LENGTH_SHORT).show());

        buttonOneWay.setOnClickListener(v ->
                Toast.makeText(this, "One Way clicked", Toast.LENGTH_SHORT).show());

        switchOneWay.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String status = isChecked ? "One Way ON" : "One Way OFF";
            Toast.makeText(this, status, Toast.LENGTH_SHORT).show();
        });

        buttonTraveller.setOnClickListener(v ->
                Toast.makeText(this, "Traveller clicked", Toast.LENGTH_SHORT).show());

        buttonDepart.setOnClickListener(v ->
                Toast.makeText(this, "Depart clicked", Toast.LENGTH_SHORT).show());
    }
}
