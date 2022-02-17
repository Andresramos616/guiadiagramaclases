
package TIENDA;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Productos {
    private int codi;
    private String nombre;
    private String Tipo;
    private String vencimi;
    private String Fabri;
    private int Cantidad;
    private double precio;

    public Productos(int codi, String nombre, String Tipo, String vencimi, String Fabri, int Cantidad, double precio) {
        this.codi = codi;
        this.nombre = nombre;
        this.Tipo = Tipo;
        this.vencimi=vencimi;
        this.Fabri = Fabri;
        this.Cantidad = Cantidad;
        this.precio = precio;
    }

    public int getCodi() {
        return codi;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getVencimi() {
        return vencimi;
    }

    public String getFabri() {
        return Fabri;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
