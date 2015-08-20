
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class SinglyLinkedList<E> extends ALista<E> {
    
   protected int count; 
   protected Node<E> head; 
   protected Node<E> tail; 

   public SinglyLinkedList()
   
   {
      head = null;
      count = 0;
      tail = null;
   }
   
   public int size()
  
  {
    return count;
  }
  
  public void addFirst(E value)
  
  {
     
     int item =this.size();
     if (item==0){
        head = new Node<E>(value);
        count++;
     }
     else {
         Node<E> temp= head;
         head = new Node<E>(value);
         count++;
         head.setNext(temp);
     
     }
  }
  
  public E removeFirst()
 
 {
	Node<E> temp = head;
	head = head.next(); 
	count--;
	return temp.value();
 }
 
 public E getFirst()
 
 {
     int item =this.size();
     if (item!=0){
	return head.value();
     }
     else 
         return null;
 }
 
 
  public E removeLast()
 {
    int item =this.size();
     if (item==0){
        return null;
     }
     
     else {
         Node<E> temp= head;
         Node<E> temp2= temp.next();
         while (temp2.next()!=null){
             temp = temp.next();
             temp2 = temp.next();
         }
         count--;
         temp.setNext(null);
         return temp.value();
     }
 }
  
 public void addLast(E value)
 {
     int item =this.size();
     if (item==0){
        head = new Node<E>(value);
        count++;
        head.setNext(null);
     }
     
     else {
         Node<E> temp= head;
         while (temp.next()!=null){
             temp = temp.next();
         }
         temp.setNext(new Node<E>(value));
         count++;
         temp.setNext(null);
     }
 }
}
