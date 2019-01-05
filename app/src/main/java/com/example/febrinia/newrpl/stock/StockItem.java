package com.example.febrinia.newrpl.stock;

public class StockItem {
    private String photoUrl;
    private String name;

    public StockItem(String photoUrl, String name) {
        this.photoUrl = photoUrl;
        this.name = name;
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
}