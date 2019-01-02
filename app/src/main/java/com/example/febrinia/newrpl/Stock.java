package com.example.febrinia.newrpl;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;


import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class Stock extends AppCompatActivity {

    private Layout layout;
    int[] images = {R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob, R.drawable.blob};

    String[] version = {"Android Alpha", "Android Beta", "Android Cupcake", "Android Donut", "Android Eclair", "Android Froyo", "Android Gingerbread", "Android Honeycomb", "Android Ice Cream Sandwich", "Android JellyBean", "Android Kitkat", "Android Lollipop", "Android Marshmallow", "Android Nougat"};

    String[] versionNumber = {"1.0", "1.1", "1.5", "1.6", "2.0", "2.2", "2.3", "3.0", "4.0", "4.1", "4.4", "5.0", "6.0", "7.0"};

    ListView lView;

    ListAdapter lAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_stock);
        ActionBar actionBar = getSupportActionBar();
        // Set below attributes to add logo in ActionBar.
        actionBar.setDisplayShowHomeEnabled(true);

//        lView = (ListView) findViewById(R.id.list1);

        lAdapter = new ListAdapter(Stock.this, version, versionNumber, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(Stock.this, version[i]+" "+versionNumber[i], Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the search menu action bar.
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.search_menu, menu);

        // Get the search menu.
        MenuItem searchMenu = menu.findItem(R.id.search);

        // Get SearchView object.
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchMenu);

        // Get SearchView autocomplete object.
        final SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        //searchAutoComplete.setBackgroundColor();
        searchAutoComplete.setTextColor(Color.WHITE);
        searchAutoComplete.setDropDownBackgroundResource(android.R.color.white);

        // Create a new ArrayAdapter and add data to search auto complete object.
        String dataArr[] = {"Medis", "Makanan", "Minuman", "Make up", "Elektronik", "Gerabah", "Pakaian", "Kebutuhan Bayi"};
        ArrayAdapter<String> newsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dataArr);
        searchAutoComplete.setAdapter(newsAdapter);

        // Listen to search view item on click event.
        searchAutoComplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemIndex, long id) {
                String queryString = (String) adapterView.getItemAtPosition(itemIndex);
                searchAutoComplete.setText("" + android.R.layout.activity_list_item);
                Toast.makeText(Stock.this, "you clicked " + android.R.layout.activity_list_item, Toast.LENGTH_LONG).show();
            }
        });

        // Below event is triggered when submit search query.
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                AlertDialog alertDialog = new AlertDialog.Builder(Stock.this).create();
                alertDialog.setMessage("Search keyword is " + query);
                alertDialog.show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}