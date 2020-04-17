/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Mery Acevedo
 */
public class Producto implements caducidad,impuesto{
    Calendar calendar = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();
    double precio,impuesto,total;

    @Override
    public Double pedirPrecio() {
        
        while(true){
            try{
            precio=Double.parseDouble(JOptionPane.showInputDialog("ingrese precio"));
            return precio;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"dato erroneo");
        }
        }
    }

    @Override
    public Double generarImpuesto(double a) {
        this.impuesto=a*0.13;
        return impuesto;
        
         }

    @Override
    public Double precioTotal() {
        this.total=precio+impuesto;
        return total;
    }

    @Override
    public void verificarCaducidad(int y, int m, int d, int yl, int ml, int dl) {
    calendar.set(y, m,d);
    calendar2.set(yl, ml,dl);
        switch (calendar.compareTo(calendar2)) {
            case -1:
                JOptionPane.showMessageDialog(null, "ha sobrepasado la fecha de caducidad");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "hoy vence");
            break;
            case 1:
                JOptionPane.showMessageDialog(null, "aun es comestible");
                break;
            default:
                throw new AssertionError();
        }
    
    
    }
    
}
