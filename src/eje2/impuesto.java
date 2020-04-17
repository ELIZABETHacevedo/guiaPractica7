/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;

/**
 *
 * @author Mery Acevedo
 */
public interface impuesto {
    
    Double pedirPrecio();
    Double generarImpuesto(double a);
    Double precioTotal();
}
