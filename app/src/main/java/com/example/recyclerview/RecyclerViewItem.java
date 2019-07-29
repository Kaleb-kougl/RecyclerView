package com.example.recyclerview;


public class RecyclerViewItem {
    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }

    private String mText1;
    private String mText2;

    public RecyclerViewItem(String mText1, String mText2) {
        this.mText1 = mText1;
        this.mText2 = mText2;
    }
}
