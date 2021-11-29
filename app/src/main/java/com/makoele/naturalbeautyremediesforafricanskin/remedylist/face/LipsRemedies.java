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

public class LipsRemedies extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Remedy>arrayList;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Remedies for Soft Lips");
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        //OnBackPressed
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        //ArrayList
        arrayList = new ArrayList<Remedy>();
        arrayList.add(new Remedy(R.drawable.honey_sugar,"Honey and Sugar Lip Scrub",""));

        //Display arrayList onto recyclerview using adapter
        RemedyAdapter adapter = new RemedyAdapter(arrayList,getApplicationContext());
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        adapter.notifyDataSetChanged();
    }

    private String sugarscrub(String remedy){

        remedy = "";

       return sugarscrub(remedy);
    }
}
