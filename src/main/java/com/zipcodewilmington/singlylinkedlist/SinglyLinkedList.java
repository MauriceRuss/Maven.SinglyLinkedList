package com.zipcodewilmington.singlylinkedlist;

import java.lang.reflect.Array;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    private Node head;
    private int listSize = 0;

    private class Node {

        private T element;
        private Node next;

        public Node(T element) {
            this.element = element;
        }

        public Node (Node next, T element){
            this.element = element;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getElement() {
            return element;
        }
    }

    private void incrementListSize() {
        listSize++;
    }

    private void deincrementListSize() {
        listSize--;
    }

    private int getListSize() {
        return listSize;
    }

    /**
     * Adds element to end of list
     * @param element
     */
    public void addElement(T element){

        Node newNode = new Node(element);

        if (this.head == null) {
            this.head = newNode;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }

            // Insert the new_node at last node
            last.setNext(newNode);
        }
        incrementListSize();
    }

    public boolean removeElementByIndex(int index){

        // if the index is out of range, exit
        if (index < 0 || index > getListSize() || head == null)
            return false;

        if (index == 0) {
            head = head.getNext();
            return true;
        }
        // Find element at index
        Node previous = null;
        Node current = head;
        for (int listIndex = 1 ; listIndex < index ; listIndex++) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(current.getNext());

        deincrementListSize();
        return true;
    }

    /**
     * See if list contains element
     * @param element
     * @return true if element is in list
     *         false if element is not in list
     */
    public boolean containsElement(T element){
        if (head == null) {
            return false;
        }
        Node selectedElement= head;
        if ( selectedElement.getElement().equals(element)) {
            return true;
        }
        for (int i = 0 ; i < getListSize() ; i++) {
            selectedElement = selectedElement.getNext();
            if ( selectedElement.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param element
     * @return index in list of element
     *         -1 if element is not in list
     */
    public int findIndexByElement(T element){
        if (head == null) {
            return -1;
        }
        /**
        Node selectedElement= head;
        if ( selectedElement.getElement().equals(element)) {
            return 0;
        }
        for (int i = 1 ; i < getListSize() ; i++) {
            selectedElement = selectedElement.getNext();
            if ( selectedElement.getElement().equals(element)) {
                return i;
            }
        }
         */
        Node selectedNode = head;
        for (int i = 0 ; i < getListSize() ; i++) {
            if (selectedNode.getElement().equals(element)) {
                return i;
            }
            selectedNode = selectedNode.getNext();
        }
        return -1;
    }

    public Integer getSizeOfList(){
        return getListSize();
    }

    public T getElementByIndex(int index){
        // if the index is out of range, exit
        if (index < 0 || index > getListSize())
            return null;

        Node selectedElement= head;
        for (int i = 0 ; i < index ; i++) {
            selectedElement = selectedElement.getNext();
        }
        return selectedElement.getElement();
    }

    public SinglyLinkedList<T> copySameValues(){
        return null;
    }

    public void sortList(){}

}
