package com.company.lab1.arrays.task4;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        float[] A = new float[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * -200+100);
        }
        for (float i: A) {
            System.out.print(i + " | ");
        }
        System.out.print("\n");

        int minusNumber = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                A[i] = A[i]/(i+1);
            }
            if (A[i] <= 0) {
                minusNumber++;
            }
        }
        for (float i: A) {
            System.out.print(i + " | ");
        }
        System.out.print("\n");
        System.out.println(minusNumber);
    }
}
