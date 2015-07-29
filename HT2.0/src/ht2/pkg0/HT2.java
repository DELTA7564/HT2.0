/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht2.pkg0;

/**
 *
 * @author marcosb11
 */
public class HT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada = "1 2 + 4 * 3 + ";
        int size = entrada.length();
        char vector[];
        int contador=0;
        StackArrayList<String> lista = new StackArrayList<String>();
        
        
        for(int x=0; x<size; x++){
            if(entrada.charAt(x)!=' ' && entrada.charAt(x)!='-' && entrada.charAt(x)!='*' && entrada.charAt(x)!='+' && entrada.charAt(x)!='/'){
                
            }
            else if(entrada.charAt(x)=='+'){
                
            }
            else if(entrada.charAt(x)=='-'){
                
            }
            else if(entrada.charAt(x)=='*'){
                
            }
            else if(entrada.charAt(x)=='/'){
                
            }
        }
        vector = new char[contador];
        contador = 0;
        System.out.println(vector.length);
        
        for(int x=0; x<size; x++){
            if(entrada.charAt(x)!=' '){
                contador++;
                vector[contador-1]=entrada.charAt(x);
                System.out.println(vector[contador-1]);
            }
        }
        

        
    }
    
}
