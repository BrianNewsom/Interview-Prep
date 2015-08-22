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

    public String toString() {
        String stringified = "";
        Node cursor = head;
        while(cursor != null) {
            stringified += cursor.toString();
            cursor = cursor.getNext();
        }
        return stringified;
    }
}
