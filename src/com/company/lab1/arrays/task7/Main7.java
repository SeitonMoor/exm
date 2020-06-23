package com.company.lab1.arrays.task7;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] X = new int[N];
        for (int i = 0; i < X.length; i++) {
            X[i] = (int) (Math.random() * -200 + 100);
        }
        for (int i : X) {
            System.out.print(i + " | ");
        }
        System.out.println();

        double[] Y = new double[N];

        int plusNumber = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                Y[i] = 1 - Math.sin(X[i]);
                plusNumber++;
            } else if (X[i] <= 0) {
                Y[i] = 1 - Math.cos(X[i]);
            }
        }
        for (double i : Y) {
            System.out.print(i + " | ");
        }
        System.out.println();
        System.out.println(plusNumber);
    }
}
