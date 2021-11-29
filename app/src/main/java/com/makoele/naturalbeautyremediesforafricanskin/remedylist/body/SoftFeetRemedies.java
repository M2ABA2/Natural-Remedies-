package com.makoele.naturalbeautyremediesforafricanskin.remedylist.body;

import android.os.Bundle;
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

public class SoftFeetRemedies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Remedies for Soft Feet");
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //ArrayList
        final ArrayList<Remedy>arrayList = new ArrayList<>();
        arrayList.add(new Remedy(R.drawable.sugar_srub,"Sugar Scrub",sugarScrub()));
        arrayList.add(new Remedy(R.drawable.apple_cider_vinegar,"Apple Cider Vinegar Soak",appleCiderVinegar()));
        arrayList.add(new Remedy(R.drawable.epsom_salt,"Epsom Salt Soak",epsomSaltRemedy()));
        arrayList.add(new Remedy(R.drawable.turmeric_lemon_foot,"Cream and Lemon Soak and Scrub",creamLemon()));
        arrayList.add(new Remedy(R.drawable.lemon_bicarbonate,"Bicarbonate of Soda Scrub",saltBicarbonate()));
        arrayList.add(new Remedy(R.drawable.vaseline,"Petroleum Jelly",petroleumJelly()));

        //Display arrayList onto the recyclerview using adapter
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();

    }

    public String sugarScrub(){

        String remedy = "Sugar exfoliates the skin, leaving the feet " +
                "smooth and soft\n\n" +
                "Ingredients:\n" +
                "4 tablespoons brown sugar\n" +
                "2 tablespoons Oil (preferably Olive oil)\n\n" +
                "Mix well and scrub on each foot with a " +
                "foot stone focusing more on the heel\n\n" +
                "Note: Use as often as needed";

        return remedy;
    }

    public String appleCiderVinegar(){
        String remedy = "Apple Cider Vinegar kills bacteria and clears dead skin cells. " +
                "This prevents foot odor and toe fungus.\n\n" +
                "Ingredients: 1 cup Apple Cider Vinegar\n" +
                "2 tablespoons Epsom Salt (Optional)\n\n" +
                "Add the ingredients in a foot bath or large dish filled with warm water(filled enough to cover your feet) " +
                "and soak your feet for about 20 minutes.\n" +
                "Dry your feet with a towel and apply vaseline\n\n" +
                "Note: A bucket can also be used.\n" +
                "In extreme cases, use daily ";

        return remedy;
    }

    public String epsomSaltRemedy(){
        String remedy ="Epsom Salt helps in easing pain, eliminates odor and helps " +
                "treats infection\n\n" +
                "Ingredients: 1/2 cup of Epsom Salt\n\n" +
                "Add the epsom salt in a foot bath filled with water or\n" +
                "a large dish/bucket filled with warm water " +
                "(filled enough to cover the feet)\n" +
                "Soak your feet for about 30 minutes\n" +
                "Dry with a towel and apply vaseline\n\n" +
                "Note: Use twice a week however, in extreme " +
                "cases, use daily";

        return remedy;
    }

    public String creamLemon(){
        String remedy ="The lactic acid in the cream aids in hydrating and " +
                "healing the skin while the vitamin C in the lemon help to " +
                "exfoliate the skin.\n\n" +
                "Ingredients: 1 tablespoon Fresh Cream\n" +
                "1 tablespoon Lemon Juice\n" +
                "1 teaspoon Sugar\n" +
                "Pinch of Turmeric\n\n" +
                "Mix the ingredients and apply onto the feet\n" +
                "Scrub each foot with a foot stone and " +
                "leave on for 10 minutes.\n" +
                "Wash off with lukewarm water and apply vaseline\n\n" +
                "Note: Use once a week ";

        return remedy;
    }

    public String saltBicarbonate(){
        String remedy="Bicarbonate of soda (Baking Soda) gently " +
                "exfoliates the skin removing dead skin cells and leaving " +
                "the feet soft and smooth. Olive oil adds moisture to the skin\n\n" +
                "Ingredients:\n" +
                "2 tablespoons Sea Salt\n" +
                "2 tablespoons Bicarbonate of Soda\n" +
                "1 tablespoon Lemon\n" +
                "2 tablespoons Olive Oil\n\n" +
                "Mix the ingredients, apply onto foot and scrub with a foot stone\n" +
                "Wash off and apply vaseline\n\n" +
                "Note: In extreme cases, use 3 times a week";

        return  remedy;
    }

    public String petroleumJelly(){
        String remedy ="Petroleum jelly helps keep the skin moist " +
                "and hydrated. This prevents the skin on your feet from " +
                "drying out especially during cold seasons.\n\n" +
                "For softer feet, apply vaseline daily before going to bed.";

        return remedy;
    }
}
