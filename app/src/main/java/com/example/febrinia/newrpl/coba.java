package com.example.febrinia.newrpl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class coba extends AppCompatActivity {
    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private ImageButton buttonPlus;

    int mCount = 0;
    Toolbar mMyTollbar;
    ImageButton mImageBtn;
    TextView mActivityTv, mCountTv;
    MenuItem mCartIconMenuItem;
    Context mContext = coba.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba);

        mMyTollbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mMyTollbar);
        mMyTollbar.setTitleTextColor(0xFFFFFFFF);

        createExampleList();
        buildRecyclerView();
    }

    private void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.blob, "asdasdsadkasd", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "loremipsum", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "ckckckck", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "wkwkwk", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "wewwwwww", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "ckckckck", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "wkwkwk", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "wewwwwww", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "ckckckck", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "wkwkwk", R.drawable.plus));
        mExampleList.add(new ExampleItem(R.drawable.blob, "wewwwwww", R.drawable.plus));
    }

    public void buildRecyclerView(){
        mRecyclerView = findViewById(R.id.rv_stocks2);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                doIncrement(position);
            }
        });
    }

    private void doIncrement(int position) {
        mCount++;
        mCountTv.setText(String.valueOf(mCount));
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
                Intent i = new Intent(coba.this,KeranjangUser.class);
                startActivity(i);
                //Toast.makeText(mContext, "Image Button is Clicked!", Toast.LENGTH_LONG).show();
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}