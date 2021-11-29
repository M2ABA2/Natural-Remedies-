package com.makoele.naturalbeautyremediesforafricanskin;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.makoele.naturalbeautyremediesforafricanskin.remedylist.hair.GrowthRemedies;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.hair.ProteinTreatmentRemedies;

import java.util.ArrayList;


public class HairFragment extends Fragment {


    public HairFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hair, container, false);

        //ArrayList
       final ArrayList<Item> arrayList = new ArrayList<Item>();
        arrayList.add(new Item("Growth","",R.drawable.ic_launcher_foreground));
        arrayList.add(new Item("Moisture","",R.drawable.ic_launcher_foreground));
        arrayList.add(new Item("Protein","",R.drawable.ic_launcher_foreground));
        arrayList.add(new Item("Product Buildup","",R.drawable.ic_launcher_foreground));
       // arrayList.add(new Remedies("Growth","",R.drawable.ic_launcher_foreground));

        //Add arrayList into the ListView through adapter
        ListAdapter adapter = new ListAdapter(getContext(),arrayList);
        ListView listView = (ListView)v.findViewById(R.id.list_hair);
        listView.setAdapter(adapter);

        //When item in the listView is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                try {
                    switch (position){

                        case 0:
                            startActivity(new Intent(getContext(), GrowthRemedies.class));
                            break;

                        case 2:
                            startActivity(new Intent(getContext(), ProteinTreatmentRemedies.class));
                            break;

                        default:
                    }

                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getContext(), "Error: "+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });


        return v;
    }
}