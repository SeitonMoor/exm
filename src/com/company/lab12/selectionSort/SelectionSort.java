package com.company.lab12.selectionSort;

import java.util.Random;

class SelectionSort {

    static void randomInit(int[] mas, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(1000000);
        }
    }

    static void selectionSort(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            int min =  i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < mas[min]) {
                    min = j;
                }
            }
            int x = mas[i];
            mas[i] = mas[min];
            mas[min] = x;
        }
    }
}
