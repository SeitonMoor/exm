package com.company.lab6.linkedList;


public class MainList {

    public static void main(String[] args) {
        LinkedList.add("5");
        LinkedList.add("1");
        LinkedList.add("23");
        LinkedList.add("20");

        System.out.println("printList: ");
        LinkedList.printList();

        LinkedList.remove();

        System.out.println("printList: ");
        LinkedList.printList();
    }
}
