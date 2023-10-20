/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 * Importación del package transportes y del medio de transporte taxi
 */

import transportes.Taxi;

/**
 *
 * @author Cárdenas Lagui Sara 
 * Clase principal
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal ("Max","CDMX","Cafe");
        animal.setNombre("Max");
        animal.setLugar("CDMX");
        animal.setColor("Cafe");
        System.out.println(animal.toString());
        
        AnimalesAcuaticos animalAcuatico = new AnimalesAcuaticos();
        //animalAcuatico.setNumAletas(4);
        animalAcuatico.setNombre("Leo");
        animalAcuatico.setLugar("Africa");
        animalAcuatico.setColor("Gris");
        System.out.println(animalAcuatico);
        
        Ballena ballena = new Ballena(30, " Willi", " Mexico", " Gris");
        System.out.println(ballena);
        
        Perro perro = new Perro("rojo",4,"Lukas","CDMX","Blanco");
        System.out.println(perro);
        
        Pajaro pajaro = new Pajaro ("Largo",2,"Wallas","Rio de Janeiro","Amarillo");
        System.out.println(pajaro);
        
        Taxi taxi = new Taxi(12,"CU", "Verde", 8, 35, 500,300, 50, 374, "Metro colectivo", "Naranja", "Mexico");
        System.out.println(taxi);
        
        
        
        //MediosDeTransporte mediosDeTransporte = new MediosDeTransporte ();
        //System.out.println(mediosDeTransporte);
        //Implemetar lo del cuestionario previo
    }
    
        
    
    
}
