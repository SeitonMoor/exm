package com.company.lab9.exception;

public class MyArrayDataException extends Exception {
    private int detail;

    MyArrayDataException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" + "detail= " + detail + ", message= " + getMessage() + "} ";
    }
}
