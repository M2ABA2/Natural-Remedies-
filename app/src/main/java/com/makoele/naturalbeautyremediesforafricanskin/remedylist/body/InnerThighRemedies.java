package com.makoele.naturalbeautyremediesforafricanskin.remedylist.body;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.makoele.naturalbeautyremediesforafricanskin.R;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.Remedy;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.RemedyAdapter;

import java.util.ArrayList;

public class InnerThighRemedies extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Remedies for Inner Thigh and Bikini Line");
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //ArrayList
        final ArrayList<Remedy> arrayList = new ArrayList<>();
        arrayList.add(new Remedy(R.drawable.coffee_scrub,"Coffee Scrub",bicarbonateCoffee()));
        arrayList.add(new Remedy(R.drawable.sugar_srub,"Lemon Sugar Scrub",lemonSugarScrub()));
        arrayList.add(new Remedy(R.drawable.olive_oil,"Olive Oil",oliveOil()));
        arrayList.add(new Remedy(R.drawable.tomato_cream,"Yogurt and Tomato",yogurtTomato()));
        arrayList.add(new Remedy(R.drawable.turmeric3,"Tomato and Turmeric",tomatoTurmeric()));

        //Adding the arrayList to the recyclerView using the adapter
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();

    }


//REMEDIES

public String bicarbonateCoffee() {

    String remedy = "Bicarbonate of Soda (baking soda) is an exfoliating agent " +
            "that aids in removing dead skin cells.\n" +
            "Coffee is loaded with antioxidants " +
            "that remove dark marks and brighten the skin\n\n" +
            "Ingredients:\n" +
            "1 teaspoon Sugar\n" +
            "1 teaspoon Bicarbonate of Soda\n" +
            "1 teaspoon Coffee\n\n" +
            "Mix the dry ingredients well and then add the lemon juice\n\n" +
            "Apply on the area and leave on for 10 - 20 minutes and wash off with " +
            "luke warm water\n\n" +
            "Note: Use once a week until the desired effect is reached" +
            " ";

    return remedy;
    }

public String yogurtTomato(){

        String remedy ="The lactic acid in Greek Yogurt exfoliates the skin to " +
                "remove dead skin cells\n" +
                "Tomato helps in fighting cellular damage leaving the skin radiant\n\n" +
                "Ingredients:\n" +
                "Half of a Tomato\n" +
                "1 Tablespoon Greek Yogurt\n\n" +
                "Squeeze the tomato juice into a bowel and mix with the yogurt\n" +
                "Apply on the area and leave on for 5 minutes\n\n" +
                "Wash off with lukewarm water \n\n" +
                "Note: Use daily for a month to see noticeable changes";

        return remedy;
}

public String lemonSugarScrub(){

        String remedy ="Sugar helps exfoliates the skin which will help remove a buildup " +
                "of dead skin.\n" +
                "Lemon juice helps to lighten the area\n\n" +
                "Ingredients:\n" +
                "1 teaspoon Sugar\n" +
                "1 tablespoon Honey\n" +
                "2 tablespoons Fresh Lemon Juice\n\n" +
                "Mix the ingredients and gently scrub onto the area for about a minute\n" +
                "Rinse the area with lukewarm water\n\n" +
                "Note: Use daily before taking a bath/shower";

        return remedy;
}

public String oliveOil(){

        String remedy="Olive oil is anti-oxidant that repair skin cells " +
                "It removes dirt and dead skin cells, leaving behind healthy " +
                "skin.\n\n" +
                "Ingredients: Olive Oil\n\n" +
                "Apply a generous amount of olive oil onto the area and massage for " +
                "3 minutes.\n" +
                "Leave overnight\n\n" +
                "Note: Use daily until desired effect is reached";

        return remedy;
}

public String tomatoTurmeric(){

        String remedy="Tomatoes exfoliate, moisturize and fight cell damage in " +
                "the skin.\n" +
                "Turmeric contain antioxidants that revive the skin and bring out its" +
                "natural glow\n\n" +
                "Ingredients: \n" +
                "1 teaspoon Turmeric\n" +
                "1 Tomato \n\n" +
                "Cut a slice of the Tomato (put away the rest to use the following day)." +
                "Dip the tomato slice into the turmeric powder and rub onto your thigh." +
                "Rub in a circular motion for a minute and leave on until it dries.\n" +
                "Wash off with luke warm water.\n\n" +
                "Note: Use daily before taking a bath/shower";

        return remedy;
}

public String potato(){

        String remedy ="";

        return remedy;
}
}
