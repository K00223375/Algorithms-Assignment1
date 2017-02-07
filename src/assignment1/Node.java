/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author K00223375
 */
public class Node {

    private String element;  // element stored in this node
    private Node next; // reference to the next node in the list

// constructors
    public Node(String e, Node n) {
//create a node given element and next reference
        element = e;
        next = n;
    }

    public Node() {
        element = null;
        next = null;
    }

    public void setElement(Student newElem) {
        element = newElem.printStudentDetails();
    }

    public void setNext(Node newNext) {
        next = newNext;
    }

// accessor methods
    public String getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
}
