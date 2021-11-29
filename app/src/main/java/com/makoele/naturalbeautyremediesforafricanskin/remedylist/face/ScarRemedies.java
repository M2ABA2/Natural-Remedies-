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

public class ScarRemedies extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Scar Remedies");
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        //backPressed
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        //Add items to ArrayList
        final ArrayList<Remedy> arrayList = new ArrayList<>();
        arrayList.add(new Remedy(R.drawable.tumerichoney,"Turmeric and Honey",turmericHoney()));
        arrayList.add(new Remedy(R.drawable.tumeric1,"Turmeric",turmeric()));
        arrayList.add(new Remedy(R.drawable.aloe_vera,"Aloe Vera",aloeVera()));
        arrayList.add(new Remedy(R.drawable.potatoes,"Potatoes",potatoes()));
        arrayList.add(new Remedy(R.drawable.tomato,"Tomatoes",tomatoes()));

        //Adapter
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());
        //Recyclerview
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();


    }

    private String turmericHoney(){
        String remedy = "Turmeric has anti inflammatory and antioxidant properties which gives the skin a radiant glow\n" +
                "Ingredients:\n" +
                "2 tablespoons of turmeric\n" +
                "2 tablespoons of Honey\n\n" +
                "Mix the turmeric and honey and apply onto your face\n" +
                "Leave on for 30 min and wash off with warm water and your face wash to remove the\n" +
                "turmeric stain\n\n" +
                "Note: Use up to a week to see noticeable changes";

        return remedy;
    }

    private String turmeric(){
        String remedy = "Ingredients:\n" +
                "2 tablespoons of turmeric\n" +
                "2 tablespoons of honey\n" +
                "1/2 tablespoon of apple cider vinegar\n" +
                "1 teaspoon of lemon\n" +
                "2 drops of tea tree oil\n" +
                "Mix the ingredients well and\n" +
                "apply onto the face\n" +
                "Leave on for 30 min\n" +
                "Wash off with warm water and your face wash to remove turmeric stain\n\n" +
                "Note: Use for a minimum of a week to see noticeable results\n" +
                "Store the remaining mixture in fridge to use for the following day";

        return remedy;
    }

    private String aloeVera(){
        String remedy ="Ingredients:\n " +
                "Aloe Vera leaf\n\n" +
                "Cut off a small piece of the aloe\n" +
                "Slice the piece in the center and cut the gel from the lead\n" +
                "mix the gel in a bowl and rub onto your face\n" +
                "Leave on for 15 min and wash off with warm water\\n\n" +
                "Note: use 4-5 times a week\\n store the remaining aloe leaf in the fridge";

        return remedy;
    }

    private String potatoes(){
        String remedy ="Ingredients:\n" +
                "One potato\n" +
                "Option 1: cut the potato into slices and apply directly onto the face\n" +
                "Option 2: Grate the potato or cut the potato into pieces and blend it\n" +
                "Once in a grated form, drain the juice into a bowl using a cloth.\n" +
                "Using a cotton ball, apply the juice onto your face and leave it on\n" +
                "for 25 -30min\n Wash off with warm water.\n\n" +
                "Note: store the leftover juice in the fridge to apply the next day";

        return remedy;
    }

    private String tomatoes(){
        String remedy = "Ingredients:\n" +
                "One Tomato\n" +
                "2 tablespoons of sugar\n\n" +
                "Option 1: Cut a tomato into slices and apply directly onto your face\n\n" +
                "Option 2: Pour the Sugar (Brown or White) in a bowl\n" +
                "Cut out one half of the tomato and squeeze the juice into the bowl of sugar\n" +
                "Mix well and apply onto the face\n\n" +
                "Leave on for 30 min and wash off with warm water\n" +
                "Note: Use up to a week to see a noticeable difference";

        return remedy;
    }
}
