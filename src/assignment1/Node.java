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
public class Node 
{
    private Object element;  // element stored in this node
  private Node next; // reference to the next node in the list
  
// constructors
public Node(Object e, Node n) { 
//create a node given element and next reference
    element = e;
    next = n;
  } 

    Node() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setElement(Object newElem) 
  { element = newElem; }

  public void setNext(Node newNext) 
  { next = newNext; }
  
// accessor methods
  public Object getElement( ) 
  { return element; }

  public Node getNext( ) 
  { return next; }
}
