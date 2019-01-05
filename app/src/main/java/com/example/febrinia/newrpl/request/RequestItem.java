package com.example.febrinia.newrpl.request;

public class RequestItem {
    private String photoUrl;
    private String name;
    private int button;

    public RequestItem(String photoUrl, String name, int button) {
        this.photoUrl = photoUrl;
        this.name = name;
        this.button = button;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }
}