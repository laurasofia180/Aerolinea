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
public class Datos {
    
    public String Origen;
    public String Destino;
    public String NombreUsuario;
    public String ApellidoUsuario;
    private int IdUsuario;
    private int TelefonoUsurio;
    public int horaSalida;
    public int horaLlegada;
    private int CapacidadAvion;
    public int ValorPasaje;
   
    
    public String getOrigen(){
        return Origen;
    }
    
    public String getDestino(){
            return Destino;
    }
    
    public String getNombreUsuario(){
        return NombreUsuario;
    }
    
    public String getApellidoUsuario(){
        return ApellidoUsuario;
    }
    
    public int gethoraSalida(){       
        return horaSalida;
    }
    
    public int gethoraLlegada(){        
        return horaLlegada;
    }
    
    public int getValorPasaje(){       
        return ValorPasaje;
    }
}
 

