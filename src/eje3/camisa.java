/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;

import javax.swing.JOptionPane;

/**
 *
 * @author Mery Acevedo
 */
public class camisa extends prendaVestir implements tela,estiloCamisa {

    @Override
    public void tipoTela() {
        JOptionPane.showMessageDialog(null, "tipo de tela: lino");
    
    }

    @Override
    public void estilo() {
        JOptionPane.showMessageDialog(null, "estilo : camiseta");
    }

    @Override
    void dprecio() {
        JOptionPane.showMessageDialog(null, "precio: $:300.00");
    }
    
}
