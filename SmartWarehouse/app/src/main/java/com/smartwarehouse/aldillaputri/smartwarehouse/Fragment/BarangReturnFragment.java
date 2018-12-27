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

public class BarangReturnFragment extends Fragment {
    public BarangReturnFragment(){};
    public TextView tv1;
    public static BarangReturnFragment newInstance(){
        return new BarangReturnFragment();
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
        View rootview = inflater.inflate(R.layout.barang_return_fragment, container, false);
        tv1 = (TextView) rootview.findViewById(R.id.barang_return_text1);
        return rootview;
    }
}
