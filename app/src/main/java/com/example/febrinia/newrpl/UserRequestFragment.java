package com.example.febrinia.newrpl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.febrinia.newrpl.request.RequestAdapter;
import com.example.febrinia.newrpl.request.RequestItem;

import java.util.ArrayList;
import java.util.List;

public class UserRequestFragment extends Fragment {

    RecyclerView list;
    RequestAdapter listAdapter;

    public UserRequestFragment() {
        // Required empty public constructor
    }

    public static UserRequestFragment newInstance() {
        return new UserRequestFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_request_user, container, false);

        return rootview;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list = view.findViewById(R.id.rv_stocks2);
        listAdapter = new RequestAdapter();
        list.setAdapter(listAdapter);
        getData();
    }


    private void getData() {
        List<RequestItem> dummyItem = new ArrayList<>();
        dummyItem.add(new RequestItem("asdasdasd", "asdasdsadkasd", R.drawable.plus));
        dummyItem.add(new RequestItem("loremipsum", "loremipsum", R.drawable.plus));
        dummyItem.add(new RequestItem("wewewe", "ckckckck", R.drawable.plus));
        dummyItem.add(new RequestItem("cobacoba", "wkwkwk", R.drawable.plus));
        dummyItem.add(new RequestItem("wowwww", "wewwwwww", R.drawable.plus));
        dummyItem.add(new RequestItem("wewewe", "ckckckck", R.drawable.plus));
        dummyItem.add(new RequestItem("cobacoba", "wkwkwk", R.drawable.plus));
        dummyItem.add(new RequestItem("wowwww", "wewwwwww", R.drawable.plus));
        dummyItem.add(new RequestItem("wewewe", "ckckckck", R.drawable.plus));
        dummyItem.add(new RequestItem("cobacoba", "wkwkwk", R.drawable.plus));
        dummyItem.add(new RequestItem("wowwww", "wewwwwww", R.drawable.plus));
        listAdapter.submitList(dummyItem);
    }
}
