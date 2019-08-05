package com.androidplayground.travelmantics;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DealAdapter {

    public class DealViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        public DealViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        }

        public void bind(TravelDeal deal ){
            tvTitle.setText(deal.getTitle());
        }
    }
}
