package com.example.tugasandroidnavigationdrawer;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

public class AdapterKuliner extends RecyclerView.Adapter<ViewHolder_Kuliner> {

    private Context context;
    private List<items> itemsList;

    public AdapterKuliner(Context context, List<items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ViewHolder_Kuliner onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder_Kuliner(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_Kuliner holder, int position) {
        holder.bind(itemsList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}

