package com.smartwarehouse.aldillaputri.smartwarehouse.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.smartwarehouse.aldillaputri.smartwarehouse.R;

public class LaporanHarianFragment extends Fragment {
    public LaporanHarianFragment(){};

    public TextView tv1, tv2, tv3;
    public Button btn1;
    public Spinner sp1, sp2, sp3;

    public static LaporanHarianFragment newInstance(){
        return new LaporanHarianFragment();
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
        View rootview = inflater.inflate(R.layout.laporan_harian_fragment, container, false);

        tv1 = (TextView) rootview.findViewById(R.id.lap_hari_text1);
        tv2 = (TextView) rootview.findViewById(R.id.lap_hari_text2);
        tv3 = (TextView) rootview.findViewById(R.id.lap_hari_text3);

        sp1 = (Spinner) rootview.findViewById(R.id.lap_hari_spinner1);
        sp2 = (Spinner) rootview.findViewById(R.id.lap_hari_spinner2);
        sp3 = (Spinner) rootview.findViewById(R.id.lap_hari_spinner3);

        btn1 = (Button) rootview.findViewById(R.id.lap_hari_btn1);

        return rootview;
    }
}