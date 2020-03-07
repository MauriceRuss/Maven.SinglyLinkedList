package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    public SinglyLinkedList() {
    }

    public void addElement(int element){}

    public void removeElementByIndex(int index){}

    public boolean containsElement(int element){
        return false;
    }

    public Integer findElementByIndex (int index){
        return null;
    }

    public Integer getSizeOfList(){
        return null;
    }

    public Integer getElementByIndex(){
        return null;
    }

    public SinglyLinkedList copysSameValues(){
        return null;
    }

    public void sortList(){}





    class Node {
        int element;
        Node next;

        public Node (int element, Node next){
            this.element = element;
            this.next = next;
        }
    }
}
