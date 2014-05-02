/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author sofia
 */
public class Nodo {

    private static boolean add(Datos datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int Dato;
    Nodo sig;
    Nodo ant;
    
    Nodo nodo = new Nodo();
    Datos datos = new Datos();

    public Nodo(int entrada) {
        Dato = entrada;
        sig = ant = null;

        //this.Dato=a;
        //this.sig=null;
        //this.ant=null;
    }

    private Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDato() {
        return Dato;
    }

    public Nodo getEnlace() {
        return sig;
    }

    public void setEnlace(Nodo sig) {
        this.sig = sig;
    }
   
    public void GuardarDatos(Datos datos){
        if(Nodo.add(datos)){
            
            JOptionPane.showMessageDialog(null,"Los datos fueron agregados correctamente");
        
    } 
        
   }
}

