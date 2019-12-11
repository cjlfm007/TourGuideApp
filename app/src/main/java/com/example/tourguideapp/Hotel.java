package com.example.tourguideapp;

public class Hotel {
    private String name;
    private String price;
    private int score;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Hotel(String name, String price, int score, int mImageResourceId) {
        this.name = name;
        this.price = price;
        this.score = score;
        this.mImageResourceId = mImageResourceId;
    }

    public Hotel(String name, String price, int score) {
        this.name = name;
        this.price = price;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
