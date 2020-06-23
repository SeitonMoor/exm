package com.company.lab2.matrices.task01;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] X = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                X[i][j] = 0;
                System.out.print(X[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j){
                    X[i][j] = 1;
                }
                System.out.print(X[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
