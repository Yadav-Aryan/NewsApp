package com.example.myapplication;

import android.widget.ImageView;

public class HomeRvModel {
    String title;
    String desc;

    public HomeRvModel(String title, String desc){
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
