package com.makoele.naturalbeautyremediesforafricanskin.remedylist.face;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.makoele.naturalbeautyremediesforafricanskin.R;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.Remedy;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.RemedyAdapter;

import java.util.ArrayList;

public class AcnePimplesRemedies extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Acne and Pimple Remedies");
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        //BackPressed
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //ArrayList
        final ArrayList<Remedy> arrayList = new ArrayList<Remedy>();
        arrayList.add(new Remedy(R.drawable.honey,"Honey and Cinnamon",honeyCinnamon()));
        arrayList.add(new Remedy(R.drawable.onions,"Onion Juice",onionJuice()));
        arrayList.add(new Remedy(R.drawable.boiled_rice_water,"Boiled Rice Water",boiledRiceWater()));

        //View arrayList onto the RecyclerView using an adapter
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();

    }

    private String honeyCinnamon(){
        String remedy = "Ingredients:\n" +
                "1 teaspoon of Cinnamon\n" +
                "2 teaspoons of honey\n" +
                "Mix cinnamon and honey and\n" +
                "apply onto your skin\n\n" +
                "Leave on for 30min - 1 hour and wash off with lukewarm water\n\n" +
                "Note: use 2-3 times a week";

        return remedy;
    }

    private String onionJuice(){
        String remedy = "Ingredients:\n" +
                "One onion\n\n" +
                "Grate or cut the onion into piece and blend it\n" +
                "Use a cloth to drain the juice into a bowl\n" +
                "Use a cotton ball to apply the onion juice onto your face\n\n" +
                "Leave on for 20 min and wash off with cool water\n\n" +
                "Note: Use 3-4 times a week";

        return remedy;
    }

    private String boiledRiceWater(){
        String remedy  = " Ingredients:\n" +
                "Boiled rice water\n" +
                "Tea tree oil\n" +
                "When draining boiled rice water, set aside some and pour into\n" +
                "a cup for skin use\n" +
                "Mix 2 tablespoons of rice water with one drop of tea tree oil\n" +
                "and apply onto your face\n" +
                "Leave it to dry (approx 5 min) and wash off with warm water\n\n" +
                "Note: Add a few drops of essential oil into the remaining rice water\n" +
                "to mask the fermentation smell ans store in the fridge\n\n" +
                "Use a minimum of a week to see results";

        return remedy;
    }
}
