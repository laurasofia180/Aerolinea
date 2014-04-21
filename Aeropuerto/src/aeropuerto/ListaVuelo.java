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
public class ListaVuelo {
    Nodo primero;
    Nodo ultimo;
    private int num;

    ListaVuelo() {
        primero = null;
        ultimo = null;
    }

    public boolean vacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Borrar(int a) {
        Nodo x = primero;
        Nodo y;
        for (int i = 0; i < a; i++) {
            y = x.ant;
            x = x.sig;
        }
        y = x.ant;
        System.out.println(this);
    Nodo anterior = null;
    Nodo actual = primero;
    while(actual != ultimo){
        int num = 0;
        if (actual.Dato == num) {
            if (anterior == null) {
                primero = actual.sig;
                primero.ant = null;
            } else {
                anterior.sig = actual.sig;
                Nodo temp;
                temp = actual.sig;
                temp.ant = anterior;
            }
            System.out.println(true);
        }
        anterior = actual;
        actual = actual.sig;
    }
    if(num == ultimo.Dato){
        ultimo = actual.ant;
        System.out.println(true);
    }
        System.out.println(true);
    }
    public void Insertar(int Dato){
        
    }
}
