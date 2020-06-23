package com.company.lab13.generics.storage;

import com.company.lab13.generics.weights.Weight;

import java.util.ArrayList;

public class Storage {
    /*
    public class Storage<T extends Weight> {
    T weight;
     */
    private ArrayList<Weight> list = new ArrayList<Weight>();

    public void addToStorage(Weight weight) {
        for (Weight weightI : list) {
            if (weightI.getClass() != weight.getClass()) {
                System.out.println("Данное хранилище содержит груза другого типа");
                return;
            }
        }
        list.add(weight);
    }

    public void storageWeight(Storage storage) {
        int sWeight1 = 0;
        int sWeight2 = 0;

        for (Weight weight : list) {
            sWeight1 = sWeight1 + weight.getWeight();
        }
        System.out.println("\nРазмер 1 хранилища: " + sWeight1);

        for (Weight weight: storage.list) {
            sWeight2 = sWeight2 + weight.getWeight();
        }
        System.out.println("Размер 2 хранилища: " + sWeight2);

        if (sWeight1 > sWeight2) {
            System.out.println("Хранилище 1 больше Хранилища 2");
        } else if (sWeight1 < sWeight2) {
            System.out.println("Хранилище 2 больше Хранилища 1");
        } else {
            System.out.println("Хранилища равны");
        }
    }

    public void  combineStorage(Storage storage) {
        for (Weight weight : list) {
            for (Weight weight1 : storage.list) {
                if (weight.getClass() != weight1.getClass()) {
                    System.out.println("\nХранилища содержат грузы разных типов");
                    return;
                }
            }
        }
        list.addAll(storage.list);
    }
}
