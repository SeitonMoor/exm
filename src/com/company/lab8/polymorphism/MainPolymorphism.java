package com.company.lab8.polymorphism;

import java.io.IOException;

public class MainPolymorphism {

    public static void main(String[] args) throws IOException {
        Polygonal polygonal = new Polygonal("Обычный");
        polygonal.setLength(3);
        polygonal.printStats();
        polygonal.findPerimeter();

        System.out.println("= = = = = = =");

        RegularPolygonal regularPolygonal = new RegularPolygonal("Правильный");
        regularPolygonal.setLength(6);
        regularPolygonal.setLength(5);
        regularPolygonal.printStats();
        regularPolygonal.findPerimeter();
    }
}
