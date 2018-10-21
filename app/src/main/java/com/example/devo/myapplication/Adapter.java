package com.example.devo.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.RViewHolder> {
    List<Cat> list;

    public Adapter(List<Cat> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowlayout,viewGroup,false);

        return new RViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RViewHolder rViewHolder, int i) {
        Cat mCat = list.get(i);
        rViewHolder.titleEn.setText(mCat.getTitleEN());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RViewHolder extends RecyclerView.ViewHolder
    {
        TextView titleEn ;

        public RViewHolder(@NonNull View itemView) {
            super(itemView);
            titleEn = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
