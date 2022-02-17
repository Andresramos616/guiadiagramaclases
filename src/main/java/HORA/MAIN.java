
package HORA;

import javax.swing.JOptionPane;


public class MAIN {
     public static void main (String [] args){
    int hor = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora "));
    int min = Integer.parseInt(JOptionPane.showInputDialog("Digite los minutos "));
    int seg = Integer.parseInt(JOptionPane.showInputDialog("Digite los segundos "));
    
    RELOJ RE = new RELOJ();
    
    RE.arreglo(hor, min, seg);
    
    
    }
}
