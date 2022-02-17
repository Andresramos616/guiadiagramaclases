
package CLASES;


public class FRACCIONES {
 //ATRIBUTOS
    int numerador;
    int denominador;
    
 //METODOS 
    public static void main (String [] args){
    FRACCIONES fracc= new FRACCIONES();
    fracc.numerador=1;    
    fracc.denominador=3;
    
     System.out.println("la fraccion ingresada es :");
    System.out.println(fracc.numerador+"/"+fracc.denominador);
    }
}
