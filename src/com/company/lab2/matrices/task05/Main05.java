package com.company.lab2.matrices.task05;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        float middleR = 0;
        int count = 0;
        int plusN = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = (int) (Math.random() * -200 + 100);
                middleR += A[i][j];
                count++;
                if(A[i][j] > 0){
                    plusN++;
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =");

        int[] C = new int[plusN];
        int k = 0;
        if (middleR/count > 0) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (middleR/count < A[i][j]){
                        C[k] = A[i][j];
                        k++;
                    }
                }
            }
            for (int i = 0; i < C.length; i++) {
                if (C[i] > 0) {
                    System.out.print(C[i] + "\t");
                }
            }
        } else {
            System.out.println("Среднее арифмитическое матрицы A - отрицательно");
        }
    }
}