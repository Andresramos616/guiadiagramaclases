
package TIENDA;

public class Principal {
    
    public static void main(String[] args){
    Tienda tienda= new Tienda (40, "LECHE ALQUERIA" , " LACTEO " , "24/8/2022 " , " ALQUERIA ",70,3000,"CARREFOUR","CALLE 24 NUMERO 25",320280);
    Tienda tienda2= new Tienda (8, "CARNE" , " CARNICO " , "4/6/2022 " , " FACENDA ",265,18000,"CARREFOUR","CALLE 24 NUMERO 25",320280);
    Tienda tienda3= new Tienda (22, "PAPAYA" , " FRUTA " , "23/9/2023 " , " HUERTO ROSALES ",20,5000,"CARREFOUR","CALLE 24 NUMERO 25",320280);
    Tienda tienda4= new Tienda (17, "ACEITUNAS" , " ENLATADO " , "4/8/2022 " , " LA RAZON ",100,7500,"CARREFOUR","CALLE 24 NUMERO 25",320280);
    tienda.mostrar();
    
    System.out.println("  ");
    tienda2.mostrar();
    
    System.out.println("  ");
    tienda3.mostrar();
    
    System.out.println("  ");
    tienda4.mostrar();
    }
}
