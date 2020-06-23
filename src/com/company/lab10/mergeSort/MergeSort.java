package com.company.lab10.mergeSort;

import java.util.Random;

class MergeSort {

    static void randomInit(int[] mas, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(1000000);
        }
    }

    static int[] mergeSort(int[] mas) {
        if (mas.length < 2) {
            return mas;
        }

        int[] first = new int [mas.length / 2];
        int[] second = new int [mas.length - first.length];

        System.arraycopy(mas, 0, first, 0, first.length);
        System.arraycopy(mas, mas.length / 2, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(mas, first, second, first.length, second.length);
        return mas;
    }

    private static void merge(int[] mas, int[] left, int[] right, int leftL, int rightL) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftL && j < rightL) {
            if (left[i] <= right[j]) {
                mas[k++] = left[i++];
            }
            else {
                mas[k++] = right[j++];
            }
        }
        while (i < leftL) {
            mas[k++] = left[i++];
        }
        while (j < rightL) {
            mas[k++] = right[j++];
        }
    }
}
