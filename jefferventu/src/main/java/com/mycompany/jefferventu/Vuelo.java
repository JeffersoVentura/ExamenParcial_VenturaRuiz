package com.mycompany.jefferventu;

import java.util.Date;

/**
 *
 * @author jvrui
 */
public class Vuelo {
    private int numero;
    private int horaSalida;
    private int horaLlegada;
    private Date fechaSalida;
    private String destino;
    private Asiento asiento;

    public Vuelo(int numero, float precio, int numAsientos, int horaSalida, int horaLlegada, Date fecha, String destino) {
        this.numero = numero;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.destino = destino;
    }
    
    public void asientosLibres (int asiento[]){
        for (int i = 0 ; i < numero ; i++){
            
        }
    }
    
    public void buscarAsiento (Asiento asiento){
        
    }
    
    public void reporteDeAsientosVendidosOrdenadosNombre(){
        
    }
    
    public void reporteDeAsientosVendidosOrdenadosNro(){
        
    }
    //agregar reportedeasientosvendidosordenadosnombre
    
}
