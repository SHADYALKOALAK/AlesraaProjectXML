package com.example.alesraaprojectxml;

public class CommentsModel {
    private String name;
    private String comment;

    public CommentsModel(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public CommentsModel(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    //
}
