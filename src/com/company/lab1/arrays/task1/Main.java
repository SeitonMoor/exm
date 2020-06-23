package com.company.lab1.arrays.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(MyVoid(a));
    }

    private static boolean MyVoid(int a){
        return (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0);
    }
}