package com.example.workoutsandnutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgGym,imgHome,imgNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGym=findViewById(R.id.imgGym);
        imgHome=findViewById(R.id.imgHome);
        imgNutrition=findViewById(R.id.imgNutrition);

        imgGym.setOnClickListener(this);
        imgHome.setOnClickListener(this);
        imgNutrition.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgGym:
                Intent intentGym = new Intent(MainActivity.this,GymWorkout.class);
                startActivity(intentGym);
                break;


            case R.id.imgHome:
                Intent intentHome = new Intent(MainActivity.this,HomeWorkout.class);
                startActivity(intentHome);
                break;


            case R.id.imgNutrition:
                Intent intentNutrition = new Intent(MainActivity.this,Nutrition.class);
                startActivity(intentNutrition);
                break;


        }

    }
}
