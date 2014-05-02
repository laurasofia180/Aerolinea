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
    public String Nombres;
    public String Apellidos;
    private String ID;
    private String Telefono;
    public String horaSalida;
    public String horaLlegada;
    private String CapacidadAvion;
    public String ValorPasaje;
   
    
    public String getOrigen(){
        return Origen;
    }
    
    public String getDestino(){
            return Destino;
    }
    
    public String getNombres(){
        return Nombres;
    }
    
    public String getApellidos(){
        return Apellidos;
    }
    
    public String gethoraSalida(){       
        return horaSalida;
    }
    
    public String gethoraLlegada(){        
        return horaLlegada;
    }
    
    public String getValorPasaje(){       
        return ValorPasaje;
    }
    
     private String getCapacidadAvion(){       
        return CapacidadAvion;
    }
     private String getID(){       
        return ID;
    }
       private String getTelefono(){       
        return Telefono;
    }
     
}
 

