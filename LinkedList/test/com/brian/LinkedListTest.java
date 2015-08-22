package com.brian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void insertToEmptyLinkedListShouldOnlyContainOneNode() {
        LinkedList ll = new LinkedList();
        Node newNode = new Node(1);

        ll.insert(newNode);

        assertEquals("Should only contain one node", newNode.toString(), ll.toString());
    }

}