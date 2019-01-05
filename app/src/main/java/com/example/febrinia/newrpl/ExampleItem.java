package com.example.febrinia.newrpl;
public class ExampleItem {
    private int mImageResource;
    private String mText1;
    private int mButton;

    public ExampleItem(int imageResource, String text1, int button) {
        mImageResource = imageResource;
        this.mText1 = text1;
        this.mButton = button;
    }

    public int getImageResource(){
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }

    public int getButton(){
        return mButton;
    }
}
