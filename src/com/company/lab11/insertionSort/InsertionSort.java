package com.company.lab11.insertionSort;

import java.util.Random;

class InsertionSort {

    static void randomInit(int[] mas, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(1000000);
        }
    }

    static void insertionSort(int[] mas) {
        for (int i = 1; i < mas.length; i++) {
            int key = mas[i];
            int j = i - 1;
            while (j >= 0 && mas[j] > key) {
                mas[j + 1] = mas[j];
                j = j - 1;
            }
            mas[j + 1] = key;
        }
    }
}
