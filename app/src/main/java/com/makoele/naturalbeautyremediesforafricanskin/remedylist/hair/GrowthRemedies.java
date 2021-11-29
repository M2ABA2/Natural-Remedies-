package com.makoele.naturalbeautyremediesforafricanskin.remedylist.hair;

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

public class GrowthRemedies extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Hair Growth Remedies");
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
        arrayList.add(new Remedy());

        //add arrayList onto the recyclerView using the adapter
        RemedyAdapter adapter = new RemedyAdapter(arrayList, getApplicationContext());
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();
    }

    //REMEDIES

    private String riceWater(){
        String remedy = "";

        return remedy;
    }

    private String onion(){
        String remedy = "" +
                "Ingredients: " +
                "1 Onion \n" +
                "1 Tablespoon Castor Oil\n" +
                "1 Tablespoon Olive Oil\n\n" +
                "Blend or grate the onion and strain the juice with a strainer, an old pantyhose " +
                "or a dish cloth\n" +
                "Add the olive and castor oil to the juice and mix well\n" +
                "Pour the mixture into a spray bottle and spray onto your hair by sections" +
                "with emphasis on the roots\n" +
                "Massage the scalp, cover with a plastic shower cap and leave on for 3o minutes\n\n" +
                "Wash off and rinse off with conditioner to remove the onion smell \n\n" +
                "Note: Use once two weeks";

        return remedy;
    }

    private String banana(){
        String remedy = "" +
                "Ingredients:\n" +
                "2 Bananas\n" +
                "1 Tablespoon Apple Cider Vinegar\n" +
                "1 Tablespoon GrapeSeed Oil\n" +
                "1 Tablespoon Olive Oil\n" +
                "1 Tablespoon Coconut Oil\n" +
                "1 Tablespoon Honey\n\n" +
                "Mix all the ingredients in a bowl and apply onto dry hair\n" +
                "Cover with a shower cap and leave on for 30 min - 1 hour\n" +
                "Wash out with lukewarm water and shampoo\n\n" +
                "Note: Use once a week";

        return remedy;
    }
}
