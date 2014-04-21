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
    Nodo (int a)
    {
        this.Dato=a;
        this.sig=null;
        this.ant=null;
    }
}
