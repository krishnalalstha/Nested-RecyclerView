package com.krish.demo.model;

import java.util.ArrayList;

public class ParentNews {
    String categoryName;
    ArrayList<News> newsArrayList;

    public ParentNews() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<News> getNewsArrayList() {
        return newsArrayList;
    }

    public void setNewsArrayList(ArrayList<News> newsArrayList) {
        this.newsArrayList = newsArrayList;
    }
}
