public class Calculador implements Calculadora{
    String linea="";
    StackVector<Integer> lista;

    
    public void setString(String linea) {
        this.linea = linea;
    }

    public void meterVector() {
         lista = new StackVector<Integer>();
    }

    public boolean calcularVector() {
        int valor1;
        int valor2;
             
        for(int x=0; x<linea.length(); x++){
            if(linea.charAt(x)!=' ' && linea.charAt(x)!='-' && linea.charAt(x)!='*' && linea.charAt(x)!='+' && linea.charAt(x)!='/'){
                lista.push(Character.getNumericValue(linea.charAt(x)));
            }
            else if(linea.charAt(x)=='+'){
                valor1 = lista.pop();
                valor2 = lista.pop();
                lista.push(valor1+valor2);
                
            }
            else if(linea.charAt(x)=='-'){
                valor2 = lista.pop();
                valor1 = lista.pop();
                lista.push(valor1-valor2);
            }
            else if(linea.charAt(x)=='*'){
                valor1 = lista.pop();
                valor2 = lista.pop();
                lista.push(valor1*valor2);
            }
            else if(linea.charAt(x)=='/'){
                valor1 = lista.pop();
                valor2 = lista.pop();
                lista.push(valor1/valor2);
            }
        }
        return true;
    }

    public int getResultado() {
        return lista.pop();
    }
    
}