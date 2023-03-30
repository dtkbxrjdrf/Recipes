package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeList extends AppCompatActivity {

    public RecipeList(String name, String description, String image, String ingredients, String directions) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public String name;
    public String description;
    public String image;
    public String ingredients;
    public String directions;
}