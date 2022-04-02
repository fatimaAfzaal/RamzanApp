package com.example.ramzanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    private RecyclerViewClickListener listener;
    ArrayList<ContactModel> arrContacts=new ArrayList<>();
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContacts)
    {
        this.context=context;
        this.arrContacts=arrContacts;
    }

    public RecyclerContactAdapter(Context context, List<ContactModel> arrContacts) {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(context).inflate(R.layout.item_contact,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

        holder.txt_name.setText(arrContacts.get(i).name);
        holder.txt_day.setText(arrContacts.get(i).day);
        holder.txt_suhoor.setText(arrContacts.get(i).suhoor);
        holder.txt_iftar.setText(arrContacts.get(i).iftar);
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View view,int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_name;
        TextView txt_day;
        TextView txt_suhoor;
        TextView txt_iftar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_name= itemView.findViewById(R.id.textView12);
            txt_day= itemView.findViewById(R.id.textView11);
            txt_suhoor= itemView.findViewById(R.id.textView9);
            txt_iftar= itemView.findViewById(R.id.textView10);
        }

    }


}
