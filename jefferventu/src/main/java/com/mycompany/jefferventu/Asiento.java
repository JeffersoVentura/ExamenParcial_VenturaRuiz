/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jefferventu;

/**
 *
 * @author jvrui
 */
public class Asiento {
    private int numero;
    private boolean estado;
    private float precio;

    public Asiento(int numero, float precio) {
        this.numero = numero;
        this.precio = precio;
    }
    
    public void reservar(){
        if(estado == true){
            System.out.println("Asiento libre, seleccione su asiento: \n");
            numero = 10;
        }
        else{
            System.out.println("Asiento no disponible");
        }
    }
    
    public void cancelar (){
        if(numero == 10){
            System.out.println("¿Desea cancelar?");
            estado = false;
        }
    }
}
