
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
 * Calculador: implementa los metodos de la interfaz 
 * Calculadora, esto para lograr hacer las revisiones y los
 * calculos correctos para procesar el resultado.
 */
public class Calculador implements Calculadora{
    private String linea=""; //almacena la cadena ingresada
    private boolean condicion=true; //almacena la condicion si es posible resolver
    private Stack<Integer> lista; //objeto de StackVector
    private StackFactory factory = new StackFactory();

    
    public void setString(String linea) {
        this.linea = linea; //se almacena cadena String ingresada
    }

    public void meterVector(int num1, int num2) {
        
        lista = factory.getStack(num1, num2); //se crea el objeto
        condicion = true; //se ajusta la condicion en true para iniciar
    }

    public boolean calcularVector() {
        int valor1=0;
        int valor2=0; //estos valores almacenan los valores a operar
             
        for(int x=0; x<linea.length(); x++){ //se recorre toda la cadena
            if(condicion){ //mientras se pueda operar se continua
                if(linea.charAt(x)>47 && linea.charAt(x)<58){ //si es un numero del 0 al 0
                    lista.push(Character.getNumericValue(linea.charAt(x))); //se ingresa en stack mediante un push
                }
                else if(linea.charAt(x)=='+'){ //si es una suma
                    if(lista.size()>1){ //deben haber dos operandos para que sea calculable
                        valor1 = lista.pop();
                        valor2 = lista.pop();//si los dos operandos existen se guardan en las variables
                        lista.push(valor1+valor2); //se operan los operandos y el resultado se guarda en stack
                    }
                    else{
                        condicion=false;//si no es operable la condicion pasa a ser false, por lo que no es calculable la linea ingresada
                    }
                    
                }
                else if(linea.charAt(x)=='-'){// si es una resta
                    if(lista.size()>1){ //deben haber dos operandos para calcular
                        valor2 = lista.pop();
                        valor1 = lista.pop();//se toma primero el valor dos ya que se sigue el orden establecido
                        lista.push(valor1-valor2);
                    }
                    else{
                        condicion=false;
                    }
                }
                else if(linea.charAt(x)=='*'){ //si es una division
                    if(lista.size()>1){ //deben haber dos operandos para calcular
                        valor1 = lista.pop();
                        valor2 = lista.pop(); //se toman los dos valores
                        lista.push(valor1*valor2); //se operan y se guarda el resultado en stack
                    }
                    else{
                        condicion=false;
                    }
                }
                else if(linea.charAt(x)=='/'){//si es una division
                    if(lista.size()>1){ //deben haber dos operandos para calcular
                        valor2 = lista.pop();
                        valor1 = lista.pop(); //se toman los valores
                        if(valor1!=0){ //pero el segundo valor no debe ser 0, ya que haria la division indefinida
                            lista.push(valor1/valor2); //opera y guarda el resultado en stack
                        }
                        else{
                            condicion=false;
                        }
                    }
                    else{
                        condicion=false;
                    }
                }
                else if(linea.charAt(x)!=' '){ //si lo que se ingreso no es ni operando, ni signo, ni espacio
                    condicion=false; //debe ser un caracter no operable, por lo que no es calculable
                }
            }
            else{
                condicion=false;
                break; //si no es calculable, se rompe el ciclo for
            }
        }
        if(lista.size()>1){ //al finalizar solo puede haber un valor en stack, el resultado
            condicion=false; //si hay mas de un valor, quiere decir que habian mas numeros que operaciones, por lo que no es calculable
        }
        return condicion; //se retorna el valor de si es posible calcular
    }

    public int getResultado() {
        return lista.pop(); //se retorna el resultado
    }
    
}