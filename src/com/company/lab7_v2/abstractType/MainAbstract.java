package com.company.lab7_v2.abstractType;

public class MainAbstract {

    public static void main(String[] args) {
        HourlyPayEmployee employee1 = new HourlyPayEmployee("Roma",1000);
        FixedPayEmployee employee2 = new FixedPayEmployee("Max", 60000);
        HourlyPayEmployee employee3 = new HourlyPayEmployee("Alex", 210);
        FixedPayEmployee employee4 = new FixedPayEmployee("Mars", 35000);

        Sort.addToList(employee1);
        Sort.addToList(employee2);
        Sort.addToList(employee3);
        Sort.addToList(employee4);

        employee1.averageMonthlyWage();
        employee2.averageMonthlyWage();
        employee3.averageMonthlyWage();
        employee4.averageMonthlyWage();

        Sort.sortByWageDecrease();
    }
}
