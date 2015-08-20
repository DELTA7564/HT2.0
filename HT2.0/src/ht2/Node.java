/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class Node<E> {
    protected E data; // value stored in this element
    protected Node<E> nextElement; // ref to next
    protected Node<E> lastElement; // ref al anterior 

    public Node(E v, Node<E> next, Node<E> before)
    // pre: v is a value, next is a reference to 
    //      remainder of list
    // post: an element is constructed as the new 
    //      head of list
    {
        data = v;
        lastElement = before;
        nextElement = next;
    }

    public Node(E v)
    // post: constructs a new tail of a list with value v
    {
        this(v,null,null);
    }

    public Node<E> next()
    // post: returns reference to next value in list
    {
        return nextElement;
    }
    public Node<E> before()
    {       
        return lastElement;
    }

    public void setLast(Node<E> last)
    {
        lastElement = last;
    }

    public void setNext(Node<E> next)
    // post: sets reference to new next value
    {
        nextElement = next;
    }

    public E value()
    // post: returns value associated with this element
    {
        return data;
    }

    public void setValue(E value)
    // post: sets value associated with this element
    {
        data = value;
    }

}
