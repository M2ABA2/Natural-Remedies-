package com.makoele.naturalbeautyremediesforafricanskin;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.makoele.naturalbeautyremediesforafricanskin.remedylist.body.IngrownHairsRemedies;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.body.InnerThighRemedies;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.body.SoftFeetRemedies;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.body.StretchMarksRemedies;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.body.UnderarmsRemedies;

import java.util.ArrayList;


public class BodyFragment extends Fragment {

    public BodyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_body, container, false);

        //Add the arrayList
        ArrayList<Item>arrayList = new ArrayList<Item>();
        arrayList.add(new Item("Ingrown Hairs","",R.drawable.flower_logo));
        arrayList.add(new Item("Inner Thighs & Bikini Line","",R.drawable.flower_logo));
        arrayList.add(new Item("Stretch Marks","",R.drawable.flower_logo));
        arrayList.add(new Item("Soft Feet","",R.drawable.flower_logo));
        arrayList.add(new Item("Underarms","",R.drawable.flower_logo));

        //Display arrayList onto the listView using an custom adapter
        ListAdapter adapter = new ListAdapter(getContext(),arrayList);
        ListView listView = (ListView)v.findViewById(R.id.list_body);
        listView.setAdapter(adapter);

        //When items in the listView clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                   switch (position){
                       case 0:
                           startActivity(new Intent(getContext(), IngrownHairsRemedies.class));
                           break;
                       case 1:
                           startActivity(new Intent(getContext(), InnerThighRemedies.class));
                           break;
                       case 2:
                           startActivity(new Intent(getContext(), StretchMarksRemedies.class));
                           break;
                       case 3:
                           startActivity(new Intent(getContext(), SoftFeetRemedies.class));
                           break;

                       case 4:
                           startActivity(new Intent(getContext(), UnderarmsRemedies.class));
                           break;

                       default:
                   }
            }
        });

        return v;
    }
}