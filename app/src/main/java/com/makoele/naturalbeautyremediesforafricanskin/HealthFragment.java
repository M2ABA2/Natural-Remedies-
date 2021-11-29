package com.makoele.naturalbeautyremediesforafricanskin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class HealthFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_health, container, false);

        //ArrayList
        final ArrayList<Item> arrayList = new ArrayList<Item>();
        arrayList.add(new Item("Moods","",R.drawable.ic_launcher_foreground));
        arrayList.add(new Item("Headache","",R.drawable.ic_launcher_foreground));
        arrayList.add(new Item("Upset Stomach","",R.drawable.ic_launcher_foreground));
        arrayList.add(new Item("Period Pains","",R.drawable.ic_launcher_foreground));
        arrayList.add(new Item("","",R.drawable.ic_launcher_foreground));

        //Display the arrayList into the ListView using an adapter
        ListAdapter adapter = new ListAdapter(getContext(),arrayList);
        ListView listView = (ListView)v.findViewById(R.id.list_health);
        listView.setAdapter(adapter);

        //When an item in the listView is selected
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO
            }
        });

        return v;
    }
}