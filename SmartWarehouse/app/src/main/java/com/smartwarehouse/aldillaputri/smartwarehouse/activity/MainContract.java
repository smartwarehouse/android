package com.smartwarehouse.aldillaputri.smartwarehouse.activity;

public interface MainContract {
    interface View{
        void showHelp(String s);
    }

    interface Presenter{
        void getHelp();
    }
}