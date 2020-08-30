/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo1.javabean;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES
 */
public class TestCirculoBean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ingrese el radio","INGRESAR",JOptionPane.PLAIN_MESSAGE);
        /*String aux = JOptionPane.showInputDialog("Ingrese el radio");
        double radio1 = Double.parseDouble(aux);
        CirculoBean circulo1 = new CirculoBean(radio1);
        JOptionPane.showMessageDialog(null, "El circulo tiene un radio de "+ circulo1.getRadio()+
                                      " el diametro es "+ circulo1.getDiametro()+
                                      " el area es " +circulo1.getArea());
        */
        System.out.println(Boolean.logicalAnd(true, false));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.min(5, 8));
        
        //double radio2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
        System.exit(0);
    }
    
}
