/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

import javax.swing.JOptionPane;

/**
 *
 * @author Mery Acevedo
 */
public class eje2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto p=new Producto();//fecha de caducidad,,,,,//fecha actual
        p.verificarCaducidad(2012, 10, 5, 2012, 10, 6);
        JOptionPane.showMessageDialog(null,"impuesto: "+String.valueOf(p.generarImpuesto(p.pedirPrecio())));
       JOptionPane.showMessageDialog(null,"precio total: "+p.precioTotal());
        
    }
    
}
