package com.company.lab7_v1.binaryTree;

public class MainTree {

    public static void main(String[] args) {
        Node n = new Node(0);
        BinaryTree.add(10);

        BinaryTree.add(30);
        BinaryTree.add(20);
        BinaryTree.add(50);

        BinaryTree.add(8);
        BinaryTree.add(9);
        BinaryTree.add(7);

        BinaryTree.add(40);
        BinaryTree.add(70);
        BinaryTree.add(55);
        BinaryTree.add(75);
        BinaryTree.add(47);
        BinaryTree.add(56);
        BinaryTree.add(57);

        BinaryTree.print();

        System.out.println("= = = = = = = = = = = =");
        BinaryTree.count(n);
        System.out.println("= = = = = = = = = = = =");

        //BinaryTree.remove(50);

        //BinaryTree.print();
    }
}
