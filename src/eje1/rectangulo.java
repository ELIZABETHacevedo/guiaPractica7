/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mery Acevedo
 */
public class rectangulo extends figuraGeometrica {
    double base,altura;

    @Override
    public double calcularA() {
        base=Double.parseDouble(JOptionPane.showInputDialog("ingrese base:"));
        
        altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese altura:"));
        return base*altura;
    }

    @Override
    public double calcularP() {
    
        return ((base*2)+(altura*2));
    }

   
    
}
