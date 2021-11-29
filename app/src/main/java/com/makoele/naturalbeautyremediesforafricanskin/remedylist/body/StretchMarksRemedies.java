package com.makoele.naturalbeautyremediesforafricanskin.remedylist.body;

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

public class StretchMarksRemedies extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Remedies for Stretch Marks");
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
        arrayList.add(new Remedy(R.drawable.coffee_scrub,"Coffee Scrub",coffeeScrub()));
        arrayList.add(new Remedy(R.drawable.lemon_bicarbonate,"Bicarbonate of Soda and Lemon Scrub",lemonBicarbonate()));
        arrayList.add(new Remedy(R.drawable.cocoa_butter,"Cocoa Butter",cocoaButter()));
        arrayList.add(new Remedy(R.drawable.shea_butter,"Shea Butter",sheaButter()));
        arrayList.add(new Remedy(R.drawable.aloe_vera2,"Aloe Vera",aloeVera()));
        arrayList.add(new Remedy(R.drawable.olive_oil,"Olive Oil",oliveOil()));
        arrayList.add(new Remedy(R.drawable.castor_oil,"Castor Oil",castorOil()));


        //Display arrayList onto recyclerView using adapter
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();
    }

    //REMEDIES
    public String coffeeScrub(){
        String remedy="Coffee contains caffeine which improves cell regeneration " +
                "by stimulating blood flow.\n\n" +
                "Ingredients: \n" +
                "2 tablespoons Coffee \n" +
                "2 tablespoons Coconut or Olive Oil\n\n" +
                "Mix well and rub in circular motion on the affected area " +
                "for about 3 - 5 minutes\n" +
                "Leave on the skin for an additional 15 minutes and wash off\n\n" +
                "Note: It takes time and consistency to see noticeable changes, " +
                "use daily for 3 - 6 months\n" +
                "For maximum effect, apply one of the mentioned oils or butter after " +
                "washing of this scrub";

        return  remedy;
    }

    public String oliveOil(){
        String remedy="Stretch marks are located in the middle layer of the skin. " +
                "Olive oil is able to penetrate into different layers of the skin, " +
                "reaching directly where the stretch marks are located\n\n" +
                "Ingredients: Olive Oil\n\n" +
                "Apply the olive oil on the affected area and massage for " +
                "about 5 minutes";

        return remedy;
    }

    public String aloeVera(){
        String remedy="Aloe vera helps to heal and regenerate skin tissue\n\n" +
                "Ingredients: Aloe Vera Leaf\n\n" +
                "Remove gel from the leaf and apply onto the affected area\n" +
                "Leave on for about 30 minutes and wash off with warm water\n\n" +
                "Note: Use daily until desired effect";

        return  remedy;
    }

    public String castorOil(){
        String remedy="Castor oil contains fat which increases the elasticity of the skin " +
                "allowing skin to stretch and contract without leaving marks\n\n" +
                "Ingredients: Castor Oil\n\n" +
                "After a shower or bath, apply the castor oil on affected area " +
                "and massage for about 5 minutes and wrap the area with a plastic wrap\n\n" +
                "Note: Use at night before sleeping\n" +
                "Use daily until the desired effect is reached";

        return remedy;
    }

    public String cocoaButter(){
        String remedy="Cocoa Butter is high in fatty acids which hydrate the skin " +
                "and improve elasticity\n\n" +
                "Ingredients: Cocoa Butter\n\n" +
                "Apply the cocoa butter on the affected area and massage " +
                "for about 5 minutes\n\n" +
                "Note: It's best to apply in the evenings before going to bed\n" +
                "Use daily until the desired effect";

        return remedy;
    }

    public String sheaButter(){
        String remedy="Shea Butter is rich in vitamin C which boosts collagen helping " +
                "to improve the elasticity of the skin\n\n" +
                "Ingredients: Shea Butter\n\n" +
                "After a shower/ bath, apply shea butter on the affected area, making sure to " +
                "massage the area for about a minute\n\n" +
                "Note: Apply twice a day\n" +
                "Use daily until the desired effect is reached";

        return remedy;
    }

    public String lemonBicarbonate(){
        String remedy="Lemon and Bicarbonate of Soda remove dead skin cells, allowing " +
                "for new healthy cells to grow.\n\n" +
                "Ingredients:\n" +
                "2 tablespoons Lemon\n" +
                "2 tablespoons Bicarbonate of Soda (Baking Soda)\n\n" +
                "Mix and apply on affected area\n" +
                "Leave on for 10 minutes and wash off with warm water\n\n" +
                "Note: Use daily until the desired effect is reached\n" +
                "Noticeable changes will be seen within a week\n" +
                "For maximum effect, apply one of the mentioned oils or butter after " +
                "washing off this scrub";

        return remedy;
    }
}
