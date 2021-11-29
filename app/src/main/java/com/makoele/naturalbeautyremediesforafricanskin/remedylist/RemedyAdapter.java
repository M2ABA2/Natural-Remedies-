package com.makoele.naturalbeautyremediesforafricanskin.remedylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makoele.naturalbeautyremediesforafricanskin.R;

import java.util.ArrayList;

import ru.embersoft.expandabletextview.ExpandableTextView;

public class RemedyAdapter extends RecyclerView.Adapter<RemedyAdapter.MyViewHolder> {

    private ArrayList<Remedy> remedies;
    private Context context;

    public RemedyAdapter(ArrayList<Remedy> remedies, Context context){
        this.remedies = remedies;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remedy_list_item,
                parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        final Remedy remedy = remedies.get(position);
        holder.imageView.setImageResource(remedy.getImageResource());
        holder.titleTextView.setText(remedy.getTitle());
        holder.descTextView.setText(remedy.getDesc());

        holder.descTextView.setOnStateChangeListener(new ExpandableTextView.OnStateChangeListener(){
           @Override
           public void onStateChange(boolean isShrink){
               Remedy contentRemedy = remedies.get(position);
               contentRemedy.setShrink(isShrink);
               remedies.set(position,contentRemedy);
           }
        });
        //Shrink back to normal view
        holder.descTextView.setText(remedy.getDesc());
        holder.descTextView.resetState(remedy.isShrink());

    }


    @Override
    public int getItemCount() {
        return remedies.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        ExpandableTextView descTextView;
        TextView titleTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_remedy);
            descTextView = itemView.findViewById(R.id.txt_remedy_desc);
              titleTextView = itemView.findViewById(R.id.txt_remedy_title);
        }
    }
}
