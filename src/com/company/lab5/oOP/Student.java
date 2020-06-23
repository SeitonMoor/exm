package com.company.lab5.oOP;

public class Student {
    private int id;
    private String name;
    private int birthYear;
    private String phoneNumber;
    private String mail;

    public Student(int id, String name, int birthYear, String phoneNumber, String mail) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
