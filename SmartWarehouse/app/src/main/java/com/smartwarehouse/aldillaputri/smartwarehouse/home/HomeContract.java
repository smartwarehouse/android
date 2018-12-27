package com.smartwarehouse.aldillaputri.smartwarehouse.home;

import com.smartwarehouse.aldillaputri.smartwarehouse.base.BasePresenter;
import com.smartwarehouse.aldillaputri.smartwarehouse.base.BaseView;

public interface HomeContract{

    interface View extends BaseView<Presenter>{
        void showBarangMasuk(int s);
        void showBarangKeluar(int s);
    }

    interface Presenter extends BasePresenter{
        void getBarangMasuk();
        void getBarangKeluar();

    }
}
