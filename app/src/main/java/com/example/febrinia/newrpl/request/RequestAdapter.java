package com.example.febrinia.newrpl.request;

import android.app.AlertDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.example.febrinia.newrpl.R;
import com.example.febrinia.newrpl.request.RequestItem;
import com.example.febrinia.newrpl.request.RequestItemViewHolder;

public class RequestAdapter extends ListAdapter<RequestItem, RequestItemViewHolder> {

    //private OnRequestItemClick listener;

    public RequestAdapter() {
        super(new DiffUtil.ItemCallback<RequestItem>() {
            @Override
            public boolean areItemsTheSame(@NonNull RequestItem requestItem, @NonNull RequestItem t1) {
                return requestItem.equals(t1);
            }

            @Override
            public boolean areContentsTheSame(@NonNull RequestItem requestItem, @NonNull RequestItem t1) {
                return requestItem.equals(t1);
            }
        });
    }

    @NonNull
    @Override
    public RequestItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_request_list_user, viewGroup, false);
        return new RequestItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RequestItemViewHolder requestItemViewHolder, final int i) {

        requestItemViewHolder.bindView(getItem(i));
    }
}
