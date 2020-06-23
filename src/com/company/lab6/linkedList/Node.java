package com.company.lab6.linkedList;

public class Node {
    private final String id;
     private Node next;

    public Node(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public String toString() {
        return id;
    }
}
