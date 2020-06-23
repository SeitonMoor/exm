package com.company.lab5.quadrangle;

public class Rect2 {
    int x1;
    int y1;
    int x2;
    int y2;

    public Rect2(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    void findQuadrangle() {
        String quadrangle1 = x1 + "." + y2;
        String quadrangle2 = x2 + "." + y2;
        String quadrangle3 = x1 + "." + y1;
        String quadrangle4 = x2 + "." + y1;

        System.out.println(quadrangle1 + "\t" + quadrangle2 + "\n" + quadrangle3 + "\t" + quadrangle4);
        System.out.println("Площадь: " + (x2 - x1) * (y2 - y1));
        System.out.println("Периметр: " + (((x2 - x1) + (y2 - y1)) * 2));
    }
}
