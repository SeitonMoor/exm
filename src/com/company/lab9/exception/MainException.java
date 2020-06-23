package com.company.lab9.exception;

public class MainException {

    public static void main(String[] args) {
        String[][] arrInteger = new String[5][5];
        String[][] arrString = new String[4][4];

        fillArray(arrInteger);
        fillArray(arrString);
        arrString[1][1] = "f";

        try {
            arrayWork(arrString);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Перехваченное исключение. " + e);
        }

        System.out.println("= = = = = = = = =");

        try {
            arrayWork(arrInteger);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Перехваченное исключение. " + e);
        }
    }

    private static void arrayWork(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length > 4) {
            throw new MyArraySizeException(1, "Массив не соотвествует размеру 4х4");
        }
        System.out.println("Массив сооствествует размеру 4х4");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!parseArrToInteger(arr[i][j])) {
                    throw  new MyArrayDataException(1, "В массиве, в ячейке [" + i + "][" + j + "] содержится символ или текст");
                }
            }
        }
        System.out.println("В массиве нет некоректных значений");
    }

    private static boolean parseArrToInteger (String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static void fillArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int buff = (int) (Math.random() * 100);
                arr[i][j] = Integer.toString(buff);
            }
        }
    }
}
