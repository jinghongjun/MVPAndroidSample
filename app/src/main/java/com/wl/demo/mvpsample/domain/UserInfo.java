package com.wl.demo.mvpsample.domain;

/**
 * Created by wangliang on 16-10-14.
 */

public class UserInfo {
    private String uid;
    private String name;
    private int age;

    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}