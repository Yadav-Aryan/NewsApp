package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeRecyclerViewAdapter.ViewHolder>{

    public Context context;
    public ArrayList<HomeRvModel> arrayList;
    public HomeRecyclerViewAdapter(Context context, ArrayList<HomeRvModel> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.home_rv_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.home_rv_title.setText(arrayList.get(position).title);
        holder.home_rv_desc.setText(arrayList.get(position).desc);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView home_rv_title, home_rv_desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            home_rv_title = itemView.findViewById(R.id.home_rv_title);
            home_rv_desc = itemView.findViewById(R.id.home_rv_desc);
        }
    }
}
