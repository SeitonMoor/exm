package com.company.lab8.polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RegularPolygonal extends Polygonal {

    RegularPolygonal(String name) throws IOException {
        super(name);
    }

    @Override
    void setLength(int count) throws IOException {
        if (3 >= count || count >= 6) {
            System.out.println("Задано неправильно значение количества сторон (4,5)");
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            setCount(count);
            System.out.println("Введите длину сторон: ");
            String s = reader.readLine();
            int v = Integer.parseInt(s);
            
            for (int i = 0; i < count; i++) {
                lengthList.add(v);
            }
        }
    }

    @Override
    void findPerimeter() {
        int perimeter = 0;
        perimeter = getCount() * lengthList.get(0);

        System.out.println("Периметр " + getName() + " равен: " + perimeter);
    }
}
