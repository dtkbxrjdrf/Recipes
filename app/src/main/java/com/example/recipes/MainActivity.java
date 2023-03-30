package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDonutActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Donut.class);
        startActivity(intent);
    }

    public void showIcecreamActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Icecream.class);
        startActivity(intent);
    }

    public void showFroyoActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Froyo.class);
        startActivity(intent);
    }

    public void openRecipeBook(View view) {
        Intent intent = new Intent(MainActivity.this, Recipe.class);
        startActivity(intent);
    }
}