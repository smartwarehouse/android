package com.example.febrinia.newrpl.stock;

import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.febrinia.newrpl.R;

public class StockAdapter extends ListAdapter<StockItem, StockItemViewHolder> {

    private OnStockItemClick listener;

    public StockAdapter() {
        super(new DiffUtil.ItemCallback<StockItem>() {
            @Override
            public boolean areItemsTheSame(@NonNull StockItem stockItem, @NonNull StockItem t1) {
                return stockItem.equals(t1);
            }

            @Override
            public boolean areContentsTheSame(@NonNull StockItem stockItem, @NonNull StockItem t1) {
                return stockItem.equals(t1);
            }
        });
    }

    @NonNull
    @Override
    public StockItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_stock, viewGroup, false);
        return new StockItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StockItemViewHolder stockItemViewHolder, final int i) {
        if (listener != null) {
            stockItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(getItem(i));
                }
            });
        }
        stockItemViewHolder.bindView(getItem(i));
    }

    public void setOnStockItemClickListener(OnStockItemClick listener) {
        this.listener = listener;
    }
}
