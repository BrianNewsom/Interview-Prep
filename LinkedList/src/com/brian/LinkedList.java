package com.brian;

public class LinkedList {

    private Node head = null;

    public static void main(String[] args) {
        Driver d = new Driver();
        d.run();
    }

    public void insert(Node node) {
        if (head == null){
            this.head = node;
        } else {
            Node cursor = head;
            while(cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            cursor.setNext(node);
        }
    }

    public Node removeByValue(int value) {
        Node toRemove = null;
        if (head == null){
            toRemove = null;
        } else if (head.getValue() == value) {
            toRemove = this.head;
            this.head = head.getNext();
        } else {
            Node cursor = head;
            Node next = cursor.getNext();
            while(next != null) {
                if (next.getValue() == value) {
                    // Skip over removed node;
                    cursor.setNext(next.getNext());
                    toRemove = next;
                    break;
                } else {
                    cursor = next;
                    next = next.getNext();
                }
            }
        }
        return toRemove;
    }

    public String toString() {
        String stringified = "Printing LL: \n";
        Node cursor = head;
        while(cursor != null) {
            stringified += cursor.toString();
            cursor = cursor.getNext();
        }
        return stringified;
    }
}
