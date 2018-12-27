package com.smartwarehouse.aldillaputri.smartwarehouse.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.BarangDaftarFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.BarangKosongFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.BarangMenuFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.BarangReturnFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.BarangTambahFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.home.HomeFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.LaporanHarianFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.StatistikMenuFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.R;
import com.smartwarehouse.aldillaputri.smartwarehouse.home.HomePresenter;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.StatistikTerlaris;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.StatistikPerTanggal;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.StatistikTiapBarangFragment;
import com.smartwarehouse.aldillaputri.smartwarehouse.Fragment.StatistikRetur;

public class MainActivity extends AppCompatActivity
        implements BarangMenuFragment.OnBarangClickListener{

    private BottomNavigationView bottomNavigationView;
    private HomeFragment homeFragment;

    //diganti sesuai dengan classnya sendiri kayak baris 26
    private Fragment barangMenuFragment, barangDaftarFragment, barangTambahFragment,
            barangReturnFragment, barangKosongFragment, laporanHarianFragment, statistikMenuFragment, statistikPerTanggal, statistikRetur, statistikTerlaris, statistikTiapBarangFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeFragment            = HomeFragment.newInstance();
        barangMenuFragment      = BarangMenuFragment.newInstance();
        barangDaftarFragment    = BarangDaftarFragment.newInstance();
        barangTambahFragment    = BarangTambahFragment.newInstance();
        barangReturnFragment    = BarangReturnFragment.newInstance();
        barangKosongFragment    = BarangKosongFragment.newInstance();
        laporanHarianFragment   = LaporanHarianFragment.newInstance();
        statistikMenuFragment   = StatistikMenuFragment.newInstance();
        statistikPerTanggal     = StatistikPerTanggal.newInstance();
        statistikRetur          = StatistikRetur.newInstance();
        statistikTerlaris       = StatistikTerlaris.newInstance();
        statistikTiapBarangFragment = StatistikTiapBarangFragment.newInstance();

        new HomePresenter(homeFragment);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();


        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        setFragment(homeFragment);
                        return true;

                    case R.id.navigation_barang:
                        setFragment(barangMenuFragment);
                        return true;

                    case R.id.navigation_laporan:
                        setFragment(laporanHarianFragment);
                        return true;

                    case R.id.navigation_statistik:
                        setFragment(statistikMenuFragment);
                        return true;
                }
                return false;
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onBarangClick(int id) {
        if(id==1){
            setFragment(barangTambahFragment);
        }
        else if(id==2){
            setFragment(barangDaftarFragment);
        }
        else if(id==3){
            setFragment(barangReturnFragment);
        }
        else
            setFragment(barangKosongFragment);
        }

}