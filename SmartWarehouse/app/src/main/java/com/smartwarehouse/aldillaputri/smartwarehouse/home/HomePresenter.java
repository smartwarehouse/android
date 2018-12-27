package com.smartwarehouse.aldillaputri.smartwarehouse.home;

public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View mHomeView;

    public HomePresenter(HomeContract.View view){
        this.mHomeView = view;
        this.mHomeView.setPresenter(this);
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void getBarangMasuk() {
        mHomeView.showBarangMasuk(200);
    }

    @Override
    public void getBarangKeluar() {
        // get dari api
        mHomeView.showBarangKeluar(500);
    }
}