
package FECHA;
import javax.swing.JOptionPane;
public class MAIN {
    
      public static void main (String [] args){
    String año = JOptionPane.showInputDialog("Que año es ? ");
    String mes = JOptionPane.showInputDialog("Que me es ? ");
    String dia = JOptionPane.showInputDialog("Que dia es ? ");
    
    Fecha fe = new Fecha();
    
    fe.calend(dia, mes, año);
    
    
    }
}
