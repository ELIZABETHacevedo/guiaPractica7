/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

/**
 *
 * @author Mery Acevedo
 */
public abstract class figuraGeometrica implements area,perimetro{

    /**
     *
     * @return
     */
    @Override
    public abstract double calcularA();

    
    @Override
    public abstract double calcularP(); 

 
   
    
    
}
