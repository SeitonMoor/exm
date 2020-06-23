package com.company.lab1.arrays.task5;

import java.util.Scanner;

public class Main5 {

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
        System.out.print("\n");

        int[] Y = new int[N];
        for (int i = 0; i < Y.length; i++) {
            Y[i] = (int) (Math.random() * -200 + 100);
        }
        for (int i : Y) {
            System.out.print(i + " | ");
        }
        System.out.print("\n");

        int changed = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] < 0) {
                X[i] = Math.abs(Y[i]);
                changed++;
            }
        }
        for (int i : X) {
            System.out.print(i + " | ");
        }
        System.out.print("\n");
        System.out.println(changed);
    }
}
