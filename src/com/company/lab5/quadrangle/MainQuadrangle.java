package com.company.lab5.quadrangle;

import java.util.Scanner;

public class MainQuadrangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1: ");
        int x1 = scanner.nextInt();
        System.out.print("y1: ");
        int y1 = scanner.nextInt();
        System.out.print("x2: ");
        int x2 = scanner.nextInt();
        System.out.print("y2: ");
        int y2 = scanner.nextInt();

        Rect2 rect2 = new Rect2(x1, y1, x2, y2);

        rect2.findQuadrangle();
    }
}
