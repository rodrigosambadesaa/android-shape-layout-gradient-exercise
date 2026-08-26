package com.example.shapelayoutgradient;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.shapelayoutgradient.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    @Override protected void onDestroy() {
        binding = null;
        super.onDestroy();
    }
}
