/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYEC;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class MAIN {
     public static void main (String [] args){
    
     int VEL = Integer.parseInt(JOptionPane.showInputDialog("Digite la velocidad en metros"));
    int ANGU = Integer.parseInt(JOptionPane.showInputDialog("Digite el angulo "));
    
    PROYECTIL PRO = new PROYECTIL();
    
    PRO.arreglo(VEL, ANGU);
    
     }   
}
