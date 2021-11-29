package com.makoele.naturalbeautyremediesforafricanskin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter<Item> {

    public ListAdapter(Context context, ArrayList<Item>remedies) {
        super(context, 0,remedies);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemListView = convertView;

        if(itemListView == null){
            itemListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false
            );
        }

        //position of the word
        Item remedy = getItem(position);

        //Set Display
        //Image
        ImageView imageView = itemListView.findViewById(R.id.img_list);
       // imageView.(remedy.getImg());

        //Display TextView
        TextView textView = itemListView.findViewById(R.id.txt_list);
        textView.setText(remedy.getName());

        TextView textDescription = itemListView.findViewById(R.id.txt_list_disc);
        textDescription.setText(remedy.getDescription());

        //Returns full ListView
        return itemListView;
    }
}
