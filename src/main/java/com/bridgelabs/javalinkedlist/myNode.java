package com.bridgelabs.javalinkedlist;

public class myNode<K> implements INode<K> {
    private K key;
    private INode next;


    public myNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getkey() {
        return key;
    }

    @Override
    public void setkey(K key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}
