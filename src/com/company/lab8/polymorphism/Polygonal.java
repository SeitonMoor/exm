package com.company.lab8.polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Polygonal {
    private String name;
    private int count;
    ArrayList<Integer> lengthList = new ArrayList<>();

    Polygonal(String name) {
        this.name = name;
    }

    void setLength(int count) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        setCount(count);

        for (int i = 0; i < count; i++) {
            System.out.println("Введите длину стороны №" + (i+1) + ": ");
            String s = reader.readLine();
            int v = Integer.parseInt(s);
            lengthList.add(v);
        }
    }

    void printStats() {
        for (int i = 0; i < count; i++) {
            System.out.println("Длина строноны №" + (i+1) + ": " + lengthList.get(i));
        }
    }

    void findPerimeter() {
        int perimeter = 0;

        for (int i = 0; i < count; i++) {
            perimeter = lengthList.get(i) + perimeter;
        }

        System.out.println("Периметр " + name + " равен: " + perimeter);
    }

    String getName() {
        return name;
    }

    int getCount() {
        return count;
    }

    void setCount(int count) {
        this.count = count;
    }
}
