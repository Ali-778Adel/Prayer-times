package com.example.salatty.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.salatty.Pojo.ItemModel;
import com.example.salatty.Pojo.SalateApiModel;
import com.example.salatty.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ModelViewHolder> {
private List<ItemModel> itemModelList;
private Context context;

    public RecyclerViewAdapter(List<ItemModel> itemModelList, Context context) {
        this.itemModelList = itemModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ModelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ModelViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.modelitem, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ModelViewHolder holder, int position) {
holder.fajrTime.setText(itemModelList.get(position).getFajr());
holder.shrokTime.setText(itemModelList.get(position).getFajr());
holder.dohrTime.setText(itemModelList.get(position).getFajr());
holder.asrTime.setText(itemModelList.get(position).getFajr());
holder.maghrbTime.setText(itemModelList.get(position).getFajr());
holder.alashaTime.setText(itemModelList.get(position).getFajr());
    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }

    public class ModelViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.day)
        TextView day;
        @BindView(R.id.day_for)
        TextView dayFor;
        @BindView(R.id.fajr_time)
        TextView fajrTime;
        @BindView(R.id.fajr)
        TextView fajr;
        @BindView(R.id.shrok_time)
        TextView shrokTime;
        @BindView(R.id.shrok)
        TextView shrok;
        @BindView(R.id.dohr_time)
        TextView dohrTime;
        @BindView(R.id.dohr)
        TextView dohr;
        @BindView(R.id.asr_time)
        TextView asrTime;
        @BindView(R.id.asr)
        TextView asr;
        @BindView(R.id.maghrb_time)
        TextView maghrbTime;
        @BindView(R.id.maghrb)
        TextView maghrb;
        @BindView(R.id.alasha_time)
        TextView alashaTime;
        @BindView(R.id.alasha)
        TextView alasha;
        public ModelViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
