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

public class IngrownHairsRemedies extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Remedies for Ingrown Hairs");
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
        arrayList.add(new Remedy(R.drawable.honey_sugar2,"SugarHoney Scrub (Before Shaving)",sugarHoneyScrub()));
        arrayList.add(new Remedy(R.drawable.tea_tree_oil,"Tea Tree Oil",teaTreeOil()));
        arrayList.add(new Remedy(R.drawable.bicarbonate_soda,"Bicarbonate of Soda (After Shaving)",bicarbonate()));
        arrayList.add(new Remedy(R.drawable.apple_cider_vinegar,"Apple Cider Vinegar (After Shaving)",appleCider()));



        //Display arrayList onto the recyclerView through the adapter
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();
    }

    //REMEDIES
    public String generalInfo(){
        String info ="";

        return info;
    }

    public String sugarHoneyScrub(){
        String remedy = "Sugar exfoliates the skin, removing bacteria " +
                "and dead skin cells which leaves the skin smooth and " +
                "moisturized \n\n" +
                "Ingredients:\n" +
                "1 tablespoon Sugar\n" +
                "2 teaspoons Honey\n\n" +
                "Mix into a paste and apply onto the area in " +
                "a circular motion \n" +
                "Leave on for about a minute and wash off with warm water while " +
                "gently scrubbing on the area with your hands\n\n" +
                "Note: Always use before shaving";
        return remedy;
    }

    public String bicarbonate(){
        String remedy ="Bicarbonate of soda helps to reduce inflammation in the " +
                "skin and also acts as a gentle exfoliant\n\n" +
                "Ingredients:\n" +
                "1 tablespoon Bicarbonate of soda (baking soda)\n\n" +
                "Mix the bicarbonate in 1 cup of water and mix well\n" +
                "Use a cotton ball to apply onto the area and leave for about 5 " +
                "minutes\n" +
                "Rinse off with cool water\n\n" +
                "Note: Use after shaving to prevent ingrown hairs\n" +
                "If you have ingrown hairs, use daily until shaving day";

        return remedy;
    }

    public String teaTreeOil(){

        String remedy="Tea Tree Oil kills bacteria and helps to reduce swelling\n\n" +
                "Ingredients: Tea Tree Oil\n\n" +
                "Apply and massage onto the area for about a minute\n\n" +
                "Note: Use at night before sleeping\n" +
                "Use daily until shaving day";

        return remedy;
    }

    public String appleCider(){
        String remedy="Apple Cider Vinegar has anti-inflammatory properties " +
                "which help prevent and eliminate ingrown hairs\n\n" +
                "Ingredients: \n" +
                "1 tablespoon Apple Cider Vinegar\n\n" +
                "Mix into 1 cup of water and mix well\n" +
                "Use a cotton ball to apply onto the area and leave on " +
                "for 10 minutes\n" +
                "Rinse off with cool water\n\n" +
                "Note: Use after shaving to prevent ingrown hairs\n" +
                "If you have ingrown hairs, use daily until shaving day";

        return remedy;
    }
}
