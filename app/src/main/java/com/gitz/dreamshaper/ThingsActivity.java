package com.gitz.dreamshaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);

        RecyclerView thingsRecyclerView = findViewById(R.id.recycler_view_things);

        Goals[] thingsToDo = {
                new Goals("Become an Android Developer", "I'm learning Android development to become a full-fledged Android Developer by 2025.", R.drawable.things_todo),
                new Goals("Launch My Own App", "I want to publish a personal app on the Play Store that solves a real-world problem.", R.drawable.things_todo),
                new Goals("Learn Jetpack Compose", "I aim to master Jetpack Compose to build modern UIs more efficiently.", R.drawable.things_todo),
                new Goals("Contribute to Open Source", "I’d love to contribute to open source Android projects and give back to the community.", R.drawable.things_todo),
                new Goals("Get Google Developer Certification", "Earning the official Android Developer certification from Google is one of my goals.", R.drawable.things_todo),
                new Goals("Improve UI/UX Skills", "I'm focused on learning more about user-centered design and great mobile UX.", R.drawable.things_todo),
                new Goals("Start a Dev Blog", "I plan to write about my Android dev journey and share tips with others.", R.drawable.things_todo),
                new Goals("Attend a Tech Conference", "I want to attend or even speak at a tech conference like Droidcon.", R.drawable.things_todo),
                new Goals("Build a Fitness App", "One of my passion projects is creating a sleek fitness tracking app for Android.", R.drawable.things_todo),
                new Goals("Mentor a Junior Dev", "Once I gain more experience, I want to help newcomers get started in Android dev.", R.drawable.things_todo),
        };


        GoalsAdapter thingsAdapter = new GoalsAdapter(thingsToDo);

        thingsRecyclerView.setAdapter(thingsAdapter);
    }
}