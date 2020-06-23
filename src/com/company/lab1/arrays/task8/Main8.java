package com.company.lab1.arrays.task8;

import java.util.Scanner;

public class Main8 {

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

        int zero = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] == 0) {
                zero++;
            }
            if (X[i] < 0) {
                X[i] = Math.abs(X[i]);
            }
        }
        for (int i : X) {
            System.out.print(i + " | ");
        }
        System.out.println();
        if (zero == 0) {
            System.out.println("Нулей нет");
        } else {
            System.out.println(zero);
        }
    }
}
