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
 * Calculadora: Interfaz de los metodos necesarios para
 * realizar la calculadora.
 */
public interface Calculadora{
    public void setString(String linea);
    
    public void meterVector(int num1, int num2);
    
    public boolean calcularVector();
    
    public int getResultado();
}
