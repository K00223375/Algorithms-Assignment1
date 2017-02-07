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
public class LinkedStack {

    private Node top;         // reference to the top node
    private int size;  // number of elements in the stack
    //private Node pTemp;
    
    public LinkedStack() {     	// Initialize the stack
        top = null;
        size = 0;
    }

    public int size() {
        // Returns the current stack size
        return size;
    }

    public boolean isEmpty() {
// Returns true if the stack is empty
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public String top() {  // Return the top stack element
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }

        return top.getElement();
    }

    public void push(Student stu) {
// Push a new object on the stack
        Node n = new Node();
        n.setElement(stu);
        n.setNext(top);
        top = n;
        size++;
        //pTemp = top;
        
    }

    public String pop() {
// Pop off the top stack element
        String temp;
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        temp = top.getElement();
        top = top.getNext();       // adjust the top node
        size--;
        //pTemp = top;
        return temp;
    }

    public void setSize() {
        this.size = 0;
    }

    /*public String printStack() {
        
        //pTemp = top;
        //String tempInfo=pTemp.getElement();
       // pTemp.getNext();
        S//tring tempInfo=pTemp.getElement();
        
        return tempInfo;
    }*/
}
