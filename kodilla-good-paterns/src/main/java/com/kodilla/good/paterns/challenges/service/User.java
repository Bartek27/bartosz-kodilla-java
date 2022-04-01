package com.kodilla.good.paterns.challenges.service;

public class User {

    private String nickName;
    private String firstName;
    private String familyName;

    public String getNickName() {
        return nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public User (String nickName, String firstName, String familyName) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.familyName = familyName;
    }

}
