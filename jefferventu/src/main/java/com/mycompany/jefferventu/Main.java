package com.mycompany.jefferventu;

import java.util.Scanner;

/**
 *
 * @author jvrui
 */
public class Main {

    public static void main(String[] args) {
        String nombre;
        String dni;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese un dni: ");
        dni = sc.nextLine();
        
        Persona dato1 = new Persona(nombre, dni);
        
        dato1.mostrarDatos();
        
    }
    
}
