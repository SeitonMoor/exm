package com.company.lab7_v2.abstractType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sort {
    private static ArrayList<Employee> list = new ArrayList<Employee>();

    static void addToList(Employee employee) {
        list.add(employee);
    }

    static void sortByWageDecrease() {
        System.out.println("Not sorted: ");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " " + employee.getAMonWage());
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAMonWage().compareTo(o2.getAMonWage());
            }
        });

        System.out.println("\nSorted: ");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " " + employee.getAMonWage());
        }
    }
}
