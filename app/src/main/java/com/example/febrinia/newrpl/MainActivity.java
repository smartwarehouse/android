package com.example.febrinia.newrpl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.ncapdevi.fragnav.FragNavController;
import com.roughike.bottombar.BottomBar;

//import info.androidhive.bottomnavigation.fragment.CartFragment;
//import info.androidhive.bottomnavigation.fragment.GiftsFragment;
//import info.androidhive.bottomnavigation.fragment.ProfileFragment;
//import info.androidhive.bottomnavigation.fragment.StoreFragment;
//import info.androidhive.bottomnavigation.helper.BottomNavigationBehavior;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;
   // private DrawerLayout aDrawerLayout;
   // private ActionBarDrawerToggle aToggle;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Toolbar toolbar = (Toolbar) findViewById(R.id.home);
       toolbar = getSupportActionBar();
       bottomNavigationView = findViewById(R.id.bottom_navigation);
       bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//        setContentView(R.layout.fragment_home);
 //       aDrawerLayout = (DrawerLayout) findViewById(R.id.home);

        //aToggle = new ActionBarDrawerToggle(this, aDrawerLayout,R.string.open,R.string.close);
        //aDrawerLayout.addDrawerListener(aToggle);
        //aToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);

        //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        // load the store fragment by default
        toolbar.setTitle("HomeActivity");
        loadFragment(new HomeFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.item1:
                    toolbar.setTitle("HomeActivity");
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.item2:
                    toolbar.setTitle("Stock");
                    fragment = new StockFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.item3:
                    toolbar.setTitle("Scan QR");
                    fragment = new ScanFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.item4:
                    toolbar.setTitle("Report");
                    fragment = new ReportFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.item5:
                    toolbar.setTitle("Request");
                    fragment = new RequestFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };



    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}