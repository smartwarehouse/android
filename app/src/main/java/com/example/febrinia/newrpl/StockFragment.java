package com.example.febrinia.newrpl;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.febrinia.newrpl.stock.OnStockItemClick;
import com.example.febrinia.newrpl.stock.StockAdapter;
import com.example.febrinia.newrpl.stock.StockDetailActivity;
import com.example.febrinia.newrpl.stock.StockItem;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class StockFragment extends Fragment implements OnStockItemClick {

    RecyclerView list;
    StockAdapter listAdapter;

    public StockFragment() {
        // Required empty public constructor
    }
    public static StockFragment newInstance() {
        return new StockFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_stock, container, false);

        return rootview;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = view.findViewById(R.id.rv_stocks);
        listAdapter = new StockAdapter();
        list.setAdapter(listAdapter);
        listAdapter.setOnStockItemClickListener(this);
        getData();
    }

    @Override
    public void onClick(StockItem item) {
        Intent intent = StockDetailActivity.getIntent(getContext());
        startActivity(intent);
    }

    private void getData() {
        List<StockItem> dummyItem = new ArrayList<>();
        dummyItem.add(new StockItem("asdasdasd", "asdasdsadkasd"));
        dummyItem.add(new StockItem("loremipsum", "loremipsum"));
        dummyItem.add(new StockItem("wewewe", "ckckckck"));
        dummyItem.add(new StockItem("cobacoba", "wkwkwk"));
        dummyItem.add(new StockItem("wowwww", "wewwwwww"));
        dummyItem.add(new StockItem("wewewe", "ckckckck"));
        dummyItem.add(new StockItem("cobacoba", "wkwkwk"));
        dummyItem.add(new StockItem("wowwww", "wewwwwww"));
        dummyItem.add(new StockItem("wewewe", "ckckckck"));
        dummyItem.add(new StockItem("cobacoba", "wkwkwk"));
        dummyItem.add(new StockItem("wowwww", "wewwwwww"));
        listAdapter.submitList(dummyItem);
    }
}
