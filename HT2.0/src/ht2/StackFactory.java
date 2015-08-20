

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class StackFactory {
    public Stack getStack(int opcion, int num){
        if(opcion ==1){
            return new StackVector<Integer>();
        }else if (opcion ==2){
            return new StackArrayList<Integer>();
        }
        else if (opcion ==3){
            return new StackLista<Integer>(num);
        }
        else{
            return new StackVector<Integer>();
        }
    }
}
