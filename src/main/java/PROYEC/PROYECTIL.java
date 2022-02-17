/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYEC;

import javax.swing.JOptionPane;


public class PROYECTIL {
   double velocidad;
   double angulo;
   
   public void arreglo(double VEL, double ANGU){
    JOptionPane.showMessageDialog(null, " Vamos a lanzar nuestro proyectil");
    System.out.println(" EL PROYEECTIL SE LANZA A  :");
    System.out.println(VEL+" METROS"+" "+ANGU+" GRADOS ");
   }
}
