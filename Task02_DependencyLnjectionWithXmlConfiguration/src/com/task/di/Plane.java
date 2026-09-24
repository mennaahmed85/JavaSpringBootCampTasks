package com.task.di;

public class Plane implements vechicle {
    private DatabaseOperation dbOperationObj;

    public void setDbOperationObj(DatabaseOperation dbOperationObj) {
        this.dbOperationObj = dbOperationObj;
    }

    @Override
    public void insert(String vehicleName) {
        dbOperationObj.insertItemIntoDB(vehicleName);
    }
}
