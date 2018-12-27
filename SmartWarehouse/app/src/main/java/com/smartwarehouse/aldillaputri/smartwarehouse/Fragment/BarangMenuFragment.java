package com.smartwarehouse.aldillaputri.smartwarehouse.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.smartwarehouse.aldillaputri.smartwarehouse.R;

public class BarangMenuFragment extends Fragment {
    public BarangMenuFragment(){}

    private OnBarangClickListener onBarangClickListener;

    public CardView cv1, cv2, cv3, cv4;
    public LinearLayout ll1, ll2, ll3, ll4, ll5, ll6, ll7, ll8;
    public TextView tv1, tv2, tv3, tv4;
    public ImageView img1, img2, img3, img4;

    public static BarangMenuFragment newInstance(){
        return new BarangMenuFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            onBarangClickListener = (OnBarangClickListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString() + " must implement OnBarangClickListener");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview2 = inflater.inflate(R.layout.barang_menu_fragment,container, false);

        cv1 = (CardView) rootview2.findViewById(R.id.barang_card1);
        cv2 = (CardView) rootview2.findViewById(R.id.barang_card2);
        cv3 = (CardView) rootview2.findViewById(R.id.barang_card3);
        cv4 = (CardView) rootview2.findViewById(R.id.barang_card4);

        ll1 = (LinearLayout) rootview2.findViewById(R.id.barang_linear1);
        ll2 = (LinearLayout) rootview2.findViewById(R.id.barang_linear2);
        ll3 = (LinearLayout) rootview2.findViewById(R.id.barang_linear3);
        ll4 = (LinearLayout) rootview2.findViewById(R.id.barang_linear4);
        ll5 = (LinearLayout) rootview2.findViewById(R.id.barang_linear5);
        ll6 = (LinearLayout) rootview2.findViewById(R.id.barang_linear6);
        ll7 = (LinearLayout) rootview2.findViewById(R.id.barang_linear7);
        ll8 = (LinearLayout) rootview2.findViewById(R.id.barang_linear8);

        tv1 = (TextView) rootview2.findViewById(R.id.barang_text1);
        tv2 = (TextView) rootview2.findViewById(R.id.barang_text2);
        tv3 = (TextView) rootview2.findViewById(R.id.barang_text3);
        tv4 = (TextView) rootview2.findViewById(R.id.barang_text4);

        img1 = (ImageView) rootview2.findViewById(R.id.barang_image1);
        img2 = (ImageView) rootview2.findViewById(R.id.barang_image2);
        img3 = (ImageView) rootview2.findViewById(R.id.barang_image3);
        img4 = (ImageView) rootview2.findViewById(R.id.barang_image4);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBarangClickListener.onBarangClick(1);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBarangClickListener.onBarangClick(2);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBarangClickListener.onBarangClick(3);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBarangClickListener.onBarangClick(4);
            }
        });

        return rootview2;
    }

    public interface OnBarangClickListener{
        public void onBarangClick(int id);
    }
}