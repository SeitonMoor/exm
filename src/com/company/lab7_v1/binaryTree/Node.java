package com.company.lab7_v1.binaryTree;

public class Node {
    private final int data;
    private Node right;
    private Node left;

    public Node(int id) {
        this.data = id;
    }

    public int getData() {
        return data;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }
}
