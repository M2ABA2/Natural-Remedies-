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

public class ProteinTreatmentRemedies extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Protein Treatment Remedies");
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //arrayList
       final ArrayList<Remedy>arrayList = new ArrayList<>();
       arrayList.add(new Remedy(R.drawable.avocado_hair,"Avocado Treatment",avocado()));
       arrayList.add(new Remedy(R.drawable.aloe_vera_hair,"Aloe Vera Treatment",aloeVera()));
       arrayList.add(new Remedy(R.drawable.mayo_hair,"Mayo Treatment",mayo()));
       arrayList.add(new Remedy(R.drawable.flower_logo2,"General Info",generalInfo()));

       //Display the arrayList onto the recyclerView using the adapter
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();



    }

    //REMEDIES
    private String avocado(){
        String remedy = "Avocado is rich in good fats, protein, Vitamin B and Vitamin C " +
                "which add moisture into the hair to help with dry and brittle hair.\n" +
                "It also contains monounsaturated fatty acids which help to absorb the " +
                "minerals onto your hair leaving it strong and shiny.\n\n" +
                "Ingredients: \n" +
                "1 Avocado \n" +
                "1 Egg \n" +
                "3 Teaspoons Olive Oil\n" +
                "1 Teaspoon Honey\n\n" +
                "Mix all the ingredients in a bowl and apply onto dry hair\n" +
                "Cover with a shower cap and leave on for 30 min - 1 hour\n" +
                "Wash out with lukewarm water and shampoo\n\n" +
                "Note: Use once a month ";

        return remedy;
    }

    private String aloeVera(){
        String remedy =  "Aloe Vera contains folic acid and vitamin B12 which " +
                "help in strengthening the hair to prevent it from falling out.\n\n " +
                "Ingredients: \n" +
                "2 Tablespoons Aloe Vera\n" +
                "1 Egg\n" +
                "1 Avocado\n\n" +
                "Mix all the ingredients in a bowl and apply onto dry hair\n" +
                "Cover with a shower cap and leave on for 30 min - 1 hour\n" +
                "Wash out with lukewarm water and shampoo\n\n" +
                "Note: Use once a month\n" +
                "Too much usage of the remedy in a short space of time can lead to fragile hair " +
                "which could be prone to breakage ";

        return remedy;
    }

    private String mayo(){
        String remedy= "Mayonnaise contains fatty acids which help to moisturize hair strands, " +
                "while the protein and vitamins help in adding shine to the hair\n\n" +
                "Ingredients:\n" +
                "2 Tablespoons Mayonnaise\n" +
                "1 Egg\n" +
                "1 Tablespoon Olive Oil\n\n" +
                "Mix all the ingredients in a bowl and apply onto dry hair\n" +
                "Cover with a shower cap and leave on for 30 min - 1 hour\n" +
                "Wash out with lukewarm water and shampoo\n\n" +
                "Note: Use once a month \n" +
                "If you have a larger Fro, multiply quantity of ingredients accordingly";

        return remedy;
    }

    private String eggWhites(){
        String remedy="Egg whites contain amino acids which help" +
                " fight dandruff, strengthens hair strands " +
                "and promote growth\n\n" +
                "Ingredients: \n" +
                "2 Egg Whites\n" +
                "1 Tablespoon Tea Tree Oil\n\n" +
                "Mix the ingredients and apply onto dry hair\n" +
                "Leave on to air dry for 30 min - 1 hour \n" +
                "Wash out with cold water\n\n" +
                "Note: Apply your conditioner after washing the egg whites out\n" +
                "Add the remaining yolks into the conditioner and leave on your hair for 5 min " +
                "and rinse out ";

        return remedy;
    }

    private String generalInfo(){
        String remedy = "A protein treatment is a treatment that helps maintain the health of the hair " +
                "by conditioning the hair, specifically " +
                "adding protein to the hair strands.\n\n " +
                "Benefits:\n" +
                "Improves the elasticity by adding moisture onto the hair\n" +
                "Strengthens the hair thus preventing breakage " +
                "\n\n" +
                "When to do Protein Treatments:\n" +
                "When hair is brittle and dry\n" +
                "Before using heat on the hair e.g hair straightener or dryer\n" +
                "Before protective styling (i.e a day before braiding), this will " +
                "help keep your hair strong and moisturized while braided\n" +
                "After unbraiding a protective style" +
                "" +
                "";

        return remedy;
    }
}
