package com.bridgelabs.javalinkedlist;

public class myNode<K> {
    private K key;
    private myNode next;


    public myNode(K key) {
        this.key = key;
        this.next = null;
    }

    public myNode getNext() {
        return next;
    }

    public void setNext(myNode next) {
        this.next = next;
    }
}
