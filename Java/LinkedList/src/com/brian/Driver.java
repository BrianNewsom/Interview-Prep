package com.brian;

public class Driver {
    public void run(){
        LinkedList ll = new LinkedList();

        Node node = new Node(1);
        Node node2 = new Node(2);

        ll.insert(node);
        ll.insert(node2);

        System.out.println(ll);

        ll.removeByValue(2);

        System.out.println(ll);

        ll.removeByValue(1);

        System.out.println(ll);

        ll.insert(node);

        ll.removeByValue(2);

        System.out.println(ll);

        ll.removeByValue(1);

        System.out.println(ll);

    }
}
