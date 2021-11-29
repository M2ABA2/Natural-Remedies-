package com.makoele.naturalbeautyremediesforafricanskin.remedylist.body;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.makoele.naturalbeautyremediesforafricanskin.R;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.Remedy;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.RemedyAdapter;

import java.util.ArrayList;

public class UnderarmsRemedies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Underarms Remedies");
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        //backPressed
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //ArrayList
       final ArrayList<Remedy>arrayList = new ArrayList<>();
        arrayList.add(new Remedy(R.drawable.tomato,"Tomato with Honey-Sugar mixture",tomatoRemedy()));
        arrayList.add(new Remedy(R.drawable.potatoes,"Potato Slices",potatoes()));
        arrayList.add(new Remedy(R.drawable.cucumber,"Cucumber Slices",cucumbers()));
        arrayList.add(new Remedy(R.drawable.chickpea_flower,"Chickpea Flour Remedy",chickpeaFlour()));
        arrayList.add(new Remedy(R.drawable.coconut_oil_skin,"Coconut Oil",coconutOil()));

        //display arrayList onto recyclingView using the adapter
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();

    }

    //Remedies

    public String tomatoRemedy(){

        String remedy ="Tomatoes are anti-oxidants known to lighten dark spots, "+
                "remove dead skin cells and cure skin irritation\n\n"+
                "Ingredients: 1 Tomato, 1 tsp Honey and 1 tsp Sugar\n" +
                "Mix the sugar and honey into a paste\n" +
                "Cut a slice of the tomato, spread the honey-sugar paste on the slice and " +
                "apply onto your underarms in circular motion\n" +
                "Leave on for 5 min and rinse off\n\n" +
                "Note: Use preferably 5 min before a shower or bath ";
        return remedy;
    }

    public String potatoes(){
        String remedy ="Potatoes have mild acidic properties that help " +
                "lighten dark spots without irritating the skin\n\n" +
                "Ingredients: One Potato\n" +
                "Cut a slice of potato and rub onto underarms for a minute\n" +
                "Leave it to dry and wash off\n\n" +
                "Note: Use preferably before a shower or bath\n" +
                "Use a minimum of a week to see noticeable changes";

        return remedy;
    }

    public String cucumbers(){
        String remedy ="Cucumbers help with odor, hydrate skin, reduce swelling " +
                "and help with the production of new cells for a smoother skin\n\n" +
                "Ingredients: Cucumber\n" +
                "Cut a slice of cucumber and rub onto underarms for a minute\n" +
                "Leave it to dry and wash off\n\n" +
                "Note: Use a minimum of a week to see noticeable changes";

        return remedy;
    }

    public String chickpeaFlour(){
        String remedy="Chickpea flour removes impurities and helps brighten the skin\n\n" +
                "Ingredients: 1 tablespoon Chickpea flour\n" +
                "1 teaspoon bicarbonate of soda\n" +
                "1/4 teaspoon of turmeric ( a pinch)\n" +
                "1/2 lemon (squeezed lemon juice)\n" +
                "1 teaspoon honey\n\n" +
                "Mix the ingredients into a bowl and apply onto armpits\n" +
                "Leave for 5min and wash off\n\n" +
                "Note: Use for a minimum of a week to see noticeable changes";

        return remedy;
    }

    public String coconutOil(){
        String remedy="Coconut oil is rich in fatty acids that help moisturize and " +
                "nourish the skin.\n" +
                "It also has antibacterial properties which makes it " +
                "a natural deodorant\n\n" +
                "Make it a habit to apply coconut oil onto your underarms every evening\n" +
                "Over time the underarms will be much smoother with less ingrown hairs ";

        return remedy;
    }
}
