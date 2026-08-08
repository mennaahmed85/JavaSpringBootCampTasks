package com.task.di;

public class DatabaseOperation {
    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void insertItemIntoDB(String item) {
        System.out.println(String.format(" %s has been inserted into the database with username = %s , url = %s"
                , item
                , username
                , url)
        );
    }
}
