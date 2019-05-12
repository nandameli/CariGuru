package com.example.cariguru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String question = getIntent().getStringExtra("question");
        String answer = getIntent().getStringExtra("answer");
        Log.i("OUR VALUE", question);
        Log.i("OUR VALUE 2", answer);
        Toast.makeText(this,""+ question, Toast.LENGTH_SHORT).show();
    }
}
