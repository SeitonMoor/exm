package com.company.lab3.bubbleSorting;

import java.util.Random;

class BubbleSort {

    static void randomInit(int[] mas, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(1000000);
        }
    }

    static void bubbleSort(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] < mas[j + 1]) {
                    mas[j] = mas[j] + mas[j + 1];
                    mas[j + 1] = mas[j] - mas[j + 1];
                    mas[j] = mas[j] - mas[j + 1];
                }
            }
        }
    }
}
