package com.example.experiment2;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // 示例：进入后显示提示
        Toast.makeText(this, "这是菜单界面", Toast.LENGTH_SHORT).show();
    }
}
