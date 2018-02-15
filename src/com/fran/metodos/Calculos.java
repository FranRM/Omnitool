/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fran.metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author femio23
 */
public class Calculos {
    public static float calcnota(){
        float n1,n2,notaf;
        n1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca a primeira nota:"));
        n2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca a segunda nota:"));
        while(n1>10||n1<0||n2>10||n2<0){
        JOptionPane.showMessageDialog(null, "Error en las notas, reviselas antes de volver a introducirlas.");
        n1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca a primeira nota:"));
        n2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca a segunda nota:"));
        }      
        notaf=(n1+n2)/2;
        return notaf;
    }
}
