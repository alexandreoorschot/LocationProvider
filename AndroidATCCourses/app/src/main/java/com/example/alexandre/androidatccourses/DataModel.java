package com.example.alexandre.androidatccourses;

public class DataModel {
    private String name;
    private int id_;

    public DataModel(String name, int id_) {
        this.name = name;
        this.id_ = id_;
    }
    public String getName () {
        return name;
    }
    public int getId_() {
        return id_;
    }
}

