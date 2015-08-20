/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public abstract class AStack<E> implements Stack<E> {
    
    public AStack(){
  
    }
    
    public boolean empty(){
        return size() == 0;
    }   
}
