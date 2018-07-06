package com.chosuwai.asarrtaline.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chosuwai.asarrtaline.delegates.ResDelegate;

public class RestaurantViewHolder extends RecyclerView.ViewHolder {

    private ResDelegate mResDelegate;

    public RestaurantViewHolder(View itemView, ResDelegate resDelegate) {
        super(itemView);
        mResDelegate=resDelegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mResDelegate.onTapRes();
            }
        });
    }
}
