
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
class ListaFactory {

    public ALista getLista (int opcion) {
        if (opcion == 1){
            return new SinglyLinkedList(); 
        }

        if(opcion == 2){
            return new DoubleLinkedList(); 
        }

        if(opcion == 3) {
            return new DoubleLinkedList();
        }
       else if(opcion == 4){ 
            return new CircularList();
        }
        else{
            return new SinglyLinkedList();
        }
    }
}
