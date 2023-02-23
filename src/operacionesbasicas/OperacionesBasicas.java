
package operacionesbasicas;

/**
 *
 * @author arms1125
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
   
    int valor1=10,valor2=8;

    public void Sum(int valor){
        float suma;
        //Reliza el cálculo de la suma
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
        
    }
    public void Res(int valor){
        float resta;
         //Reliza el cálculo de la resta
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
       
    }
    
    public void Multi(int valor){
        float multiplicación;
         //Reliza el cálculo de la multiplicación
        multiplicación = valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicación);

    }
    
    public void Div(int valor){
        float division;
        //Reliza el cálculo de la división
        division = valor1 / valor2;
        System.out.println("La division es: " + division);
    }

    public static void main(String[] args) {        
        OperacionesBasicas ops = new OperacionesBasicas();
        ops.Sum(1);
        ops.Res(2);
        ops.Multi(3);
        ops.Div(4);
    }
    
}
