package com.example.febrinia.newrpl.stock;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.febrinia.newrpl.R;

public class StockItemViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivPhoto;
    private TextView tvName;

    public StockItemViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.aNametxt);
        ivPhoto = itemView.findViewById(R.id.appIconIV);
    }

    public void bindView(StockItem item) {
        tvName.setText(item.getName());
    }
}
