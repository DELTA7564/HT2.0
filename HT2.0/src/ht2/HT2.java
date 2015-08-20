/* *******************************************************
 * Gabriel Martinez 14070
 * Belen Hernandez 14361
 * Arturo Garcia 14186
 * Marcos Benedict 143681
 *
 * *******************************************************
 * El proposito de este programa es crear una calculadora 
 * utilizando herramientas vistas en clase, como lo son
 * los ADTS, listas y Vectores.
 * *******************************************************
 * HT2: se encarga de generar el main del programa y el
 * frame para el panel que contiene la GUI
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HT2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1 =0;
        int num2 =0;
        Scanner scan = new Scanner (System.in);
        String entrada = ""; //delcaramos nuestra variable que almacena la linea
        Calculador casio = new Calculador(); //creamos objeto de Calculador
        System.out.println("Ingrese el tipo de Stack que desea utilizar: \n 1. StackVectorList \n 2. StackArrayList \n 3. StackLista");
        num1 = scan.nextInt();
        if(num1 == 1){
            System.out.println("Usted ha elegido StackVectorList");
        }        
        if(num1 == 2){
            System.out.println("Usted ha elegido StackArrayList");
        }        
        if(num1 == 3){
            System.out.println("Usted ha elegido StackLista, elija su tipo de implementacion: \n 1. Simplemente encadenada \n 2. Doblemente encadenada \n 3. Circular");
            num2= scan.nextInt();
        }        
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){ //lee file txt linea por linea
            while((entrada = br.readLine()) != null){ //si encuentra un enter se almacena la linea en entrada
                System.out.println("Se ingreso: " + entrada); //se imprime lo que se ingreso
                casio.setString(entrada); //se inicia ingresando la cadena a calculador
                casio.meterVector(num1, num2); //se arregla la cadena ingresada
                if(casio.calcularVector()){ //se calcula el resultado y se asegura que es posible operar
                   System.out.println("El Resultado es: " + casio.getResultado() + "\n"); 
                }else{
                    System.out.println("No se puede calcular, operacion contiene errores" + "\n");
                }
                
            }
        }catch (Exception e){
            
        }
    }
}