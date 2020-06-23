package com.company.lab1.arrays.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < A.length; i++){
            A[i] = (int) (Math.random() * -200+100);
        }
        for (int i: A){
            System.out.print(i + " | ");
        }
        System.out.println("\n");

        int T = sc.nextInt();
        int elem = -999;
        int index = -1;
        for (int i = 0; i < A.length; i++){
            if (A[i] == T) {
                index = i;
                for (int j = index++; j < A.length; j++){
                    if(A[j] < 0 && A[j] > elem){
                        elem = A[j];
                    }
                }
            }
        }
        if (index == -1) {
            for (int j = 0; j < A.length; j++){
                if(A[j] < 0 && A[j] > elem){
                    elem = A[j];
                }
            }
        }
        System.out.println(elem);
    }
}