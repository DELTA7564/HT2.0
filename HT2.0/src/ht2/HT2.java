import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        
        Calculador casio = new Calculador();
        
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
            while((entrada = br.readLine()) != null){
                System.out.println("Se ingreso: " + entrada);
                casio.setString(entrada);
                casio.meterVector();
                casio.calcularVector();
                System.out.println("El Resultado es: " + casio.getResultado());
            }
        }catch (Exception e){
            
        }
    }
}