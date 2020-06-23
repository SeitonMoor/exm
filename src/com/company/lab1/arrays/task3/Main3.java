package com.company.lab1.arrays.task3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * -200+100);
        }
        for (int i: A) {
            System.out.print(i + " | ");
        }
        System.out.print("\n");

        float middleR = 0;
        int plusNumber = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                middleR += A[i];
            }
            if (A[i] >= 0) {
                plusNumber++;
            }
        }

        System.out.println(middleR / A.length);
        System.out.println(plusNumber);
    }
}
