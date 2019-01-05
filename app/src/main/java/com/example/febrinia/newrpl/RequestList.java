package com.example.febrinia.newrpl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.febrinia.newrpl.request.RequestAdapter;
import com.example.febrinia.newrpl.request.RequestItem;

import java.util.ArrayList;
import java.util.List;

public class RequestList extends AppCompatActivity {

    RecyclerView list;
    RequestAdapter listAdapter;
    Toolbar mMyTollbar;
    Button mPlusBtn;
    ImageButton mImageBtn;
    TextView mActivityTv, mCountTv;
    MenuItem mCartIconMenuItem;
    int mCount = 0;
    Context mContext = RequestList.this;

    @SuppressLint("WrongViewCast")
    protected void onCreate(View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_request_user);
        list = view.findViewById(R.id.rv_stocks2);
        listAdapter = new RequestAdapter();
        list.setAdapter(listAdapter);
        getData();
        mPlusBtn = findViewById(R.id.img);

        mPlusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doIncrement();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_cart, menu);
        mCartIconMenuItem = menu.findItem(R.id.cart_menu);

        View actionView = mCartIconMenuItem.getActionView();

        if (actionView != null) {
            mCountTv = actionView.findViewById(R.id.count_tv);
            mImageBtn = actionView.findViewById(R.id.cart_ic_image);
        }

        mImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Image Button is Clicked!", Toast.LENGTH_LONG).show();
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    private void doIncrement() {
        mCount++;
        mCountTv.setText(String.valueOf(mCount));
        mActivityTv.setText(String.valueOf(mCount));
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