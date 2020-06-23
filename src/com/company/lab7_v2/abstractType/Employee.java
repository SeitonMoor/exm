package com.company.lab7_v2.abstractType;

public abstract class Employee {
    private String name;
    private int rate;
    private Double aMonWage;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getRate() {
        return rate;
    }

    void setRate(int rate) {
        this.rate = rate;
    }

    Double getAMonWage() {
        return aMonWage;
    }

    void setAMonWage(double aMonWage) {
        this.aMonWage = aMonWage;
    }

    public abstract void averageMonthlyWage();
}
