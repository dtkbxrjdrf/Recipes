package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class Recipe extends AppCompatActivity {

    private LinkedList<RecipeList> recipes;
    private RecyclerView rcView;
    private RecipeAdapter adapter;
    public static final String EXTRA_REPLY = "com.example.recipes.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        recipes = DataProvider.getRecipes();
        rcView = findViewById(R.id.recyclerview);
        adapter = new RecipeAdapter(this, recipes);
        rcView.setAdapter(adapter);
        rcView.setLayoutManager(new LinearLayoutManager(this));
    }
}