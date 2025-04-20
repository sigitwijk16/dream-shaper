package com.gitz.dreamshaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        RecyclerView placesRecyclerView = findViewById(R.id.recycler_view_places);

        Goals[] placesToGo = {
                new Goals("Kyoto", "I want to visit Kyoto's majestic castles often featured in anime battle scenes.", R.drawable.places_togo),
                new Goals("Santorini", "I'd love to see the blue-domed churches and white cliffs overlooking the sea in Greece.", R.drawable.places_togo),
                new Goals("Machu Picchu", "The ancient Incan city hidden in the Andes has always fascinated me.", R.drawable.places_togo),
                new Goals("Reykjavik", "Seeing the Northern Lights from Iceland would be a dream come true.", R.drawable.places_togo),
                new Goals("Petra", "Walking through the rose-red rock city of Petra feels like stepping into a movie scene.", R.drawable.places_togo),
                new Goals("Banff", "Exploring the turquoise lakes and mountains of Banff National Park in Canada is high on my list.", R.drawable.places_togo),
                new Goals("Kyiv", "I’d love to see the golden domes and historical sites of Ukraine’s capital.", R.drawable.places_togo),
                new Goals("Dubai", "I want to experience the futuristic skyline and desert safaris of Dubai.", R.drawable.places_togo),
                new Goals("Seoul", "I'd love to dive into the tech, tradition, and food culture of Seoul.", R.drawable.places_togo),
                new Goals("New Zealand", "Exploring the stunning landscapes that were featured in the Lord of the Rings movies sounds amazing.", R.drawable.places_togo),
        };


        GoalsAdapter placesAdapter = new GoalsAdapter(placesToGo);

        placesRecyclerView.setAdapter(placesAdapter);
    }
}