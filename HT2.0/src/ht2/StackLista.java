
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */


public class StackLista<E> implements Stack<E> {
	
	protected ALista<E> data;
	protected ListaFactory nfactory;

	public StackLista(int num) {
		
		nfactory = new ListaFactory();
		data = nfactory.getLista(num);
	}

	public void push(E item){
		
		data.addFirst(item);
	}

	public E pop(){
		
		return data.removeFirst();
	}

	public E peek() {
		
		return data.getFirst();
	}
	
	public int size(){
	
	   return data.size();
	}

        public boolean empty() {
            return size() == 0;
        }
    }
