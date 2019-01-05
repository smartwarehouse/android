package com.example.febrinia.newrpl;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private DrawerLayout aDrawerLayout;
    private ActionBarDrawerToggle aToggle;

    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13, tv14, tv15, tv16;
    private CardView cv1, cv2, cv3, cv4, cv5, cv6, cv7, cv8, cv9;
    private ImageView img1;
    private LinearLayout ll1, ll2, ll3, ll4, ll5, ll6, ll7, ll8;

    public HomeFragment() {
        // Required empty public constructor
    }
    public static HomeFragment newInstance() {
        return new HomeFragment();
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
    public View onCreateView(@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_home, container, false);

//        cv1 = rootview.findViewById(R.id.content_card1);
//        cv2 = rootview.findViewById(R.id.content_card2);
//        cv3 = rootview.findViewById(R.id.content_card3);
//        cv4 = rootview.findViewById(R.id.content_card4);
//        cv5 = rootview.findViewById(R.id.content_card5);
//        cv6 = rootview.findViewById(R.id.content_card6);
//        cv7 = rootview.findViewById(R.id.content_card7);
//        cv8 = rootview.findViewById(R.id.content_card8);
//        cv9 = rootview.findViewById(R.id.content_card9);
//        tv2 = rootview.findViewById(R.id.content_text2);
//        tv3 = rootview.findViewById(R.id.content_text3);
//        tv4 = rootview.findViewById(R.id.content_text4);
//        tv5 = rootview.findViewById(R.id.content_text5);
//        tv6 = rootview.findViewById(R.id.content_text6);
//        tv7 = rootview.findViewById(R.id.content_text7);
//        tv8 = rootview.findViewById(R.id.content_text8);
//        tv9 = rootview.findViewById(R.id.content_text9);
//        tv10 = rootview.findViewById(R.id.content_text10);
//        tv11 = rootview.findViewById(R.id.content_text11);
//        tv12 = rootview.findViewById(R.id.content_text12);
//        tv13 = rootview.findViewById(R.id.content_text13);
//        tv14 = rootview.findViewById(R.id.content_text14);
//        tv15 = rootview.findViewById(R.id.content_text15);
//        tv16 = rootview.findViewById(R.id.content_text16);
//        ll2 = rootview.findViewById(R.id.content_linear2);
//        ll3 = rootview.findViewById(R.id.content_linear3);
//        ll4 = rootview.findViewById(R.id.content_linear4);
//        ll5 = rootview.findViewById(R.id.content_linear5);
//        ll6 = rootview.findViewById(R.id.content_linear6);
//        ll7 = rootview.findViewById(R.id.content_linear7);
//        ll8 = rootview.findViewById(R.id.content_linear8);

        return rootview;
    }

//    //private ActionBar getSupportActionBar() {
//        return null;
//    }

//    public boolean onOptionsItemSelected(MenuItem item){
//        if (aToggle.onOptionsItemSelected(item)){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
