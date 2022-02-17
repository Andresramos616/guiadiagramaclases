
package TIENDA;

import java.util.Date;


public class  Tienda extends Productos{
    private String NOM_TIE;
    private String Dire;
    private int tele;
    
    
    public Tienda(int codi,String nombre,String Tipo,String vencimi,String Fabri,int Cantidad,double precio,String NOM_TIE,String Dire,int tele){
        super(codi,nombre,Tipo,vencimi,Fabri,Cantidad,precio); 
        this.NOM_TIE=NOM_TIE;
        this.Dire=Dire;
        this.tele=tele;
        
        
}

 
        
    
    public void mostrar(){
    System.out.println("NOMBRE DE LA TIENDA: "+NOM_TIE+
    "\ndDIRECCION :"+Dire+
     "\nTELEFONO: "+tele+
       "\nCODIGO PRODUCTO:"+getCodi()+
        "\nNOMBRE PRODUCTO: "+getNombre()+
          "\nQUE TIPO ES : "+getTipo()+
        "\nFECHA DE VENCIMIENTO: "+getVencimi()+
        "\nQUE EMPRESA LO FABRICO: "+getFabri()+
         "\nCUANTO INVENTARIO HAY:"+getCantidad()+
          "\nQUE PRECIO TIENE "+getPrecio());
    }
}

