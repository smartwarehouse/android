package com.smartwarehouse.aldillaputri.smartwarehouse.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.smartwarehouse.aldillaputri.smartwarehouse.R;

public class BarangKosongFragment extends Fragment {
    public BarangKosongFragment(){};

    public TextView tv1;

    public static BarangKosongFragment newInstance(){
        return new BarangKosongFragment();
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.barang_kosong_fragment, container, false);
        tv1 = (TextView) rootview.findViewById(R.id.barang_kosong_text1);

        return rootview;
    }
}
