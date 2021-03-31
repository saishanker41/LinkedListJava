package com.bridgelabs.javalinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    @Test
    void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        myNode<Integer> myFirstNode = new myNode<>(56);
        myNode<Integer> mySecondNode = new myNode<>(30);
        myNode<Integer> myThirdNode = new myNode<>(70);

        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);

    }
}
