/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author sofia
 */
public class Nodo {

    int Dato;
    Nodo sig;
    Nodo ant;

    public Nodo(int entrada) {
        Dato = entrada;
        sig = ant = null;

        //this.Dato=a;
        //this.sig=null;
        //this.ant=null;
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

    
 public void LectorArchivos(String args[]) {
            String fichero = args[0];
            try {
                try (FileReader fr = new FileReader(fichero)) {
                    BufferedReader br = new BufferedReader(fr);

                    String Linea;
                    while ((Linea = br.readLine()) != null) {
                        System.out.println(Linea);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error en lectura del archivo");
            }
        }
    }

