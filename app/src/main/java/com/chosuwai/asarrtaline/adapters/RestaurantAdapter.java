package com.chosuwai.asarrtaline.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chosuwai.asarrtaline.R;
import com.chosuwai.asarrtaline.delegates.ResDelegate;
import com.chosuwai.asarrtaline.viewholders.RestaurantViewHolder;

public class RestaurantAdapter extends RecyclerView.Adapter {

    private ResDelegate mResDelegate;

    public RestaurantAdapter(ResDelegate mResDelegate) {
        this.mResDelegate = mResDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.view_holder_offers, parent, false);
        return new RestaurantViewHolder(view, mResDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
