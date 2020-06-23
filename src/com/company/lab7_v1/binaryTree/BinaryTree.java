package com.company.lab7_v1.binaryTree;

public class BinaryTree {
    protected static int size = 0;
    protected static Node _head;

    public static void add(int value) {
        Node n = new Node(value);
        Node _thisHead = _head;

        if (_head == null) {
            _head = n;
        } else {
            while (_thisHead != null) {
                if (_thisHead.getData() < n.getData()) {
                    if (_thisHead.getRight() == null) {
                        _thisHead.setRight(n);
                        break;
                    } else {
                        _thisHead = _thisHead.getRight();
                    }
                } else if (_thisHead.getData() > n.getData()) {
                    if (_thisHead.getLeft() == null) {
                        _thisHead.setLeft(n);
                        break;
                    } else {
                        _thisHead = _thisHead.getLeft();
                    }
                }
            }
        }
    }

    public static void remove(int value) {
        Node del = new Node(value);
        Node _thisHead = _head;

        if (_head == null) {
            return;
        } else {
            while (_thisHead != null) {
                //code
            }
        }
    }

    public static void contains() {
    }

    public static void count(Node node) {
        Node startNode = _head;

        int count = 0;

        if(startNode != null){
            count(startNode.getLeft());
            System.out.println(startNode.getData());
            count(startNode.getRight());
        }
    }

    public static void clear() {
    }

    public static void print() {
        Node n = _head;
        while (n != null) {
            System.out.println(n.getData());
            n = n.getRight();
        }
    }
}
