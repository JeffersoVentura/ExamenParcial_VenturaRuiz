/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jefferventu;

import java.util.Date;

/**
 *
 * @author jvrui
 */
public class Venta {
    private Date fecha;
    private float montoTotal;
    private int numAsientos;
    private Asiento Asiento;
    private Empleado Empleado;
    private Cliente Cliente;
        
    public void agregarAsiento (Asiento asiento){
        this.Asiento = asiento;
        System.out.println("");
    }
    
    public void setEmpleado (Empleado empleado){
        this.Empleado = empleado;
    }
    
    public void setCliente (Cliente cliente){
        this.Cliente = cliente;
    }
}
