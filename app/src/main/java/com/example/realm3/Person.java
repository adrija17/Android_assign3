package com.example.realm3;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Person extends RealmObject {
    @PrimaryKey
    private long id;
    private String name;
    private String gender;
    private long phone;
    private int roll;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
