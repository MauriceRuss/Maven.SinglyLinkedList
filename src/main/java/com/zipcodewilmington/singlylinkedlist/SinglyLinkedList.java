package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    public SinglyLinkedList() {
    }

    class Node {
        int element;
        Node next;

        public Node (int element, Node next){
            this.element = element;
            this.next = next;
        }
    }
}
