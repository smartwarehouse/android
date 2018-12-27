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

public class StatistikMenuFragment extends Fragment {

    public StatistikMenuFragment(){}
    public OnStatistikClickListener onStatistikClickListener;

    public CardView cv1, cv2, cv3, cv4;
    public LinearLayout ll1, ll2, ll3, ll4, ll5, ll6, ll7, ll8;
    public TextView tv1, tv2, tv3, tv4;
    public ImageView img1, img2, img3, img4;

    public static StatistikMenuFragment newInstance() {
        return new StatistikMenuFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.statistik_menu_fragment, container, false);

        cv1 = (CardView) rootview.findViewById(R.id.statistik_card1);
        cv2 = (CardView) rootview.findViewById(R.id.statistik_card2);
        cv3 = (CardView) rootview.findViewById(R.id.statistik_card3);
        cv4 = (CardView) rootview.findViewById(R.id.statistik_card4);

        ll1 = (LinearLayout) rootview.findViewById(R.id.statistik_linear1);
        ll2 = (LinearLayout) rootview.findViewById(R.id.statistik_linear2);
        ll3 = (LinearLayout) rootview.findViewById(R.id.statistik_linear3);
        ll4 = (LinearLayout) rootview.findViewById(R.id.statistik_linear4);
        ll5 = (LinearLayout) rootview.findViewById(R.id.statistik_linear5);
        ll6 = (LinearLayout) rootview.findViewById(R.id.statistik_linear6);
        ll7 = (LinearLayout) rootview.findViewById(R.id.statistik_linear7);
        ll8 = (LinearLayout) rootview.findViewById(R.id.statistik_linear8);

        tv1 = (TextView) rootview.findViewById(R.id.statistik_text1);
        tv2 = (TextView) rootview.findViewById(R.id.statistik_text2);
        tv3 = (TextView) rootview.findViewById(R.id.statistik_text3);
        tv4 = (TextView) rootview.findViewById(R.id.statistik_text4);

        img1 = (ImageView) rootview.findViewById(R.id.statistik_image1);
        img2 = (ImageView) rootview.findViewById(R.id.statistik_image2);
        img3 = (ImageView) rootview.findViewById(R.id.statistik_image3);
        img4 = (ImageView) rootview.findViewById(R.id.statistik_image4);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStatistikClickListener.onStatistikClick(1);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStatistikClickListener.onStatistikClick(2);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStatistikClickListener.onStatistikClick(3);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStatistikClickListener.onStatistikClick(4);
            }
        });
        return rootview;
    }

    public interface OnStatistikClickListener{
        public void onStatistikClick(int id);
    }
}
