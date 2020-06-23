package com.company.lab12.selectionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSelectionSort {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите длину массива: ");

        String s = reader.readLine();
        int v = Integer.parseInt(s);

        int[] mas = new int[v];

        SelectionSort.randomInit(mas, v);
        long startTime = System.nanoTime();

        SelectionSort.selectionSort(mas);

        long estimatedTime = System.nanoTime() - startTime;
        double estimatedSeconds = (double) estimatedTime / 1_000_000_000.0;

        //Вывод созданного массива
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " | ");
        }
        //*/
        System.out.println();
        System.out.println("Времени прошло: " + estimatedSeconds + " секунд");
    }
}
