package com.smartwarehouse.aldillaputri.smartwarehouse.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.smartwarehouse.aldillaputri.smartwarehouse.R;

public class BarangDaftarFragment extends Fragment {
    public BarangDaftarFragment(){};

    public TextView tv1;

    public static BarangDaftarFragment newInstance(){
        return new BarangDaftarFragment();
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
        View rootview = inflater.inflate(R.layout.barang_daftar_fragment, container, false);
        tv1 = (TextView) rootview.findViewById(R.id.barang_daftar_text1);
        return rootview;
    }
}