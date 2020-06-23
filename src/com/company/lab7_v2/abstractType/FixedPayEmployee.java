package com.company.lab7_v2.abstractType;

class FixedPayEmployee extends Employee {

    FixedPayEmployee(String name, int fixedRate) {
        setName(name);
        setRate(fixedRate);
    }

    @Override
    public void averageMonthlyWage() {
        setAMonWage(getRate());
        System.out.println("Среднемесячная зарплата " + getName() + " " + getAMonWage() + " RUB");
    }
}
