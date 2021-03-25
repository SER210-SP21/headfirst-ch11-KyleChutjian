package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        fragment_workout_detail frag = (fragment_workout_detail) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkout(1);


    }
}