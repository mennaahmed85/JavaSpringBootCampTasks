package com.task.di;

public class Car implements vechicle {

    private DatabaseOperation dbOperationObj;

    public Car(DatabaseOperation dbOperationObj) {
        this.dbOperationObj = dbOperationObj;
    }

    @Override
    public void insert(String vehicleName) {
        dbOperationObj.insertItemIntoDB(vehicleName);
    }
}
