/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aeropuerto;

/**
 *
 * @author sofia
 */
public class Nodo {
     int Dato;
    Nodo sig;
    Nodo ant;
    public Nodo (int entrada)
    {
        Dato = entrada;
        sig = ant = null;
        
        //this.Dato=a;
        //this.sig=null;
        //this.ant=null;
    }
    public int getDato(){
        return Dato;
    }
    public Nodo getEnlace(){
        return sig;
    }
    
    public void setEnlace(Nodo sig){
        this.sig = sig;
    }
}
