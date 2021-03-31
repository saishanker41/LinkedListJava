package com.bridgelabs.javalinkedlist;

import com.bridgelabs.MyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    void given3NumbersWhenAddedToLinkedListShouldBeAddedToTheTop() {
        myNode<Integer> myFirstNode = new myNode<>(70);
        myNode<Integer> mySecondNode = new myNode<>(30);
        myNode<Integer> myThirdNode = new myNode<>(56);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
        myNode<Integer> myFirstNode = new myNode<>(56);
        myNode<Integer> mySecondNode = new myNode<>(30);
        myNode<Integer> myThirdNode = new myNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }
}
