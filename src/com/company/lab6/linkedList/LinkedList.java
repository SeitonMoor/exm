package com.company.lab6.linkedList;

public class LinkedList {
    protected static int size = 0;
    protected static Node _first;
    protected static Node _last;

    public static void add(String value) {
        Node n = new Node(value);

        if (_first == null) {
            _first = n;
            _last = n;
        } else {
            _last.setNext(n);
            _last = n;
        }
        size++;
    }

    public static void remove() {
        Node n = _first;
        while (n != null) {
            if (n.getNext().equals(_last)) {
                n.setNext(null);
            }
            n = n.getNext();
        }
        _last = null;
    }

    public static void printList() {
        Node n = _first;
        while (n != null) {
            System.out.println(n.getId());
            n = n.getNext();
        }
    }
}
