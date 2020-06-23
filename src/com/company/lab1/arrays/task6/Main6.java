package com.company.lab1.arrays.task6;

import java.util.Scanner;

public class Main6 {

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

        int[] T = new int[N];

        int write = 0;
        for (int i = 0; i < X.length; i++) {
            T[i] = Math.max(X[i], Y[i]);
            if (X[i] > Y[i]) {
                write++;
            }
        }
        for (int i : T) {
            System.out.print(i + " | ");
        }
        System.out.println();
        System.out.println(write);
    }
}
