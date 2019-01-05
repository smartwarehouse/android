package com.example.febrinia.newrpl.request;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.febrinia.newrpl.R;

public class RequestItemViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivPhoto;
    private TextView tvName;

    //IItemClickListener itemClickListener;

    private ImageButton img;

//    public void setItemClickListener(IItemClickListener itemClickListener) {
//        this.itemClickListener = itemClickListener;
//    }

    public RequestItemViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.aNametxt);
        ivPhoto = itemView.findViewById(R.id.appIconIV);
        img = itemView.findViewById(R.id.img);

        //itemView.setOnClickListener(this);
    }

    public void bindView(RequestItem item) {
        tvName.setText(item.getName());
    }
}
