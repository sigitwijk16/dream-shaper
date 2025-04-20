package com.gitz.dreamshaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView thingsCardView;
    CardView placesCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        setUpCardViewListener();

    }

    private void findViews() {
        thingsCardView = findViewById(R.id.card_view_image_things_container);
        placesCardView = findViewById(R.id.card_view_image_places_container);
    }

    private void setUpCardViewListener() {
        thingsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thingsActivityIntent = new Intent(MainActivity.this, ThingsActivity.class);

                startActivity(thingsActivityIntent);
            }
        });

        placesCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesActivityIntent = new Intent(MainActivity.this, PlacesActivity.class);

                startActivity(placesActivityIntent);
            }
        });
    }


}