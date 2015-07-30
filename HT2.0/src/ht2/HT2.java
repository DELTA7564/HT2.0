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

public class HT2 {

    public static void main(String[] args) {
        // TODO code application logic here
        String entrada = ""; //delcaramos nuestra variable que almacena la linea
        Calculador casio = new Calculador(); //creamos objeto de Calculador
        
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){ //lee file txt linea por linea
            while((entrada = br.readLine()) != null){ //si encuentra un enter se almacena la linea en entrada
                System.out.println("Se ingreso: " + entrada); //se imprime lo que se ingreso
                casio.setString(entrada); //se inicia ingresando la cadena a calculador
                casio.meterVector(); //se arregla la cadena ingresada
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