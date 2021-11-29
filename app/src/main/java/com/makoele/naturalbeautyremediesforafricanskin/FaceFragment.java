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

import com.makoele.naturalbeautyremediesforafricanskin.remedylist.face.AcnePimplesRemedies;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.face.LipsRemedies;
import com.makoele.naturalbeautyremediesforafricanskin.remedylist.face.ScarRemedies;

import java.util.ArrayList;


public class FaceFragment extends Fragment {
    ListView listView;
    Integer[] imgid = {R.drawable.ic_star_24};

    public FaceFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_face, container, false);
        //ArrayList
        final ArrayList<Item> arrayList = new ArrayList<Item>();
        arrayList.add(new Item("Scars","",R.drawable.logo));
        arrayList.add(new Item("Pimples","", R.drawable.logo));
        arrayList.add(new Item("Soft Kissable Lips","",R.drawable.logo));
        arrayList.add(new Item("Radiant Glow","",R.drawable.logo));
        arrayList.add(new Item("Facial Hair","",R.drawable.logo));

        //Add arrayList items into a listview through an adapter
        ListAdapter adapter = new ListAdapter(getContext(),arrayList);

      ListView listView = (ListView)v.findViewById(R.id.list_face);
      listView.setAdapter(adapter);

      //When item in the listview is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item remedy = arrayList.get(position);
                try {
                    switch (position){
                        case 0:
                            startActivity(new Intent(getContext(), ScarRemedies.class));
                          break;
                        case 1:
                            startActivity(new Intent(getContext(), AcnePimplesRemedies.class));
                            break;
                        case 2:
                            startActivity(new Intent(getContext(), LipsRemedies.class));
                            break;

                        default:
                    }

                }catch(Exception e){
                    Toast.makeText(getContext(), "Error: "+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });



        return v;
    }
}