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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.smartwarehouse.aldillaputri.smartwarehouse.R;

public class BarangTambahFragment extends Fragment {
    public BarangTambahFragment(){};

    public EditText et1, et2, et3;
    public Button btn1;
    public Spinner sp1, sp2;
    public LinearLayout ll1;

    public static BarangTambahFragment newInstance(){
        return new BarangTambahFragment();
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
        View rootview = inflater.inflate(R.layout.barang_tambah_fragment, container, false);

        et1     = (EditText) rootview.findViewById(R.id.barang_tambah_edit1);
        et2     = (EditText) rootview.findViewById(R.id.barang_tambah_edit2);
        et3     = (EditText) rootview.findViewById(R.id.barang_tambah_edit3);
        btn1    = (Button) rootview.findViewById(R.id.barang_tambah_button1);
        sp1     = (Spinner) rootview.findViewById(R.id.barang_tambah_spinner1);
        sp2     = (Spinner) rootview.findViewById(R.id.barang_tambah_spinner2);
        ll1     = (LinearLayout) rootview.findViewById(R.id.barang_tambah_linear1);
        return rootview;
    }
}
