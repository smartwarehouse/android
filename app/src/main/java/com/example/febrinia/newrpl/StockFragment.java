package com.example.febrinia.newrpl;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StockFragment extends Fragment {

    private ListView lv1;

    public StockFragment() {
        // Required empty public constructor
    }
    public static StockFragment newInstance() {
        return new StockFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_stock, container, false);

        lv1 = rootview.findViewById(R.id.list1);

        return rootview;
    }

}
