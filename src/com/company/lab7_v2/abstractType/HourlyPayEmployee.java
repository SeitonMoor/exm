package com.company.lab7_v2.abstractType;

class HourlyPayEmployee extends Employee {

    HourlyPayEmployee(String name, int ratePerHour) {
        setName(name);
        setRate(ratePerHour);
    }

    @Override
    public void averageMonthlyWage() {
        setAMonWage(20.8 * 8 * getRate());
        System.out.println("Среднемесячная зарплата " + getName() + " " + getAMonWage() + " RUB");
    }
}
