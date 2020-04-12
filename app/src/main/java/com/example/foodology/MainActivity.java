package com.example.foodology;

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

    public void clickAsianFood(View view) {
        Intent intent = new Intent(this, AsianFoodActivity.class);
        startActivity(intent);
    }

    public void clickCustomization(View view) {
        Intent intent = new Intent(this, Customization.class);
        startActivity(intent);
    }

    public void clickNearMe(View view) {
        Intent intent = new Intent(this, NearMe.class);
        startActivity(intent);
    }

    public void clickMyFavorite(View view) {
        Intent intent = new Intent(this, MyFavorite.class);
        startActivity(intent);
    }

    public void clickMyAccount(View view) {
        Intent intent = new Intent(this, MyAccount.class);
        startActivity(intent);
    }
}
