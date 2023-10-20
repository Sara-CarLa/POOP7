/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Cárdenas Lagui Sara Alejandra
 * Clase que guarda información de un Animal Aereo
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public AnimalAereo(int numeroAlas, String nombre, String lugar, String color) {
        super(nombre, lugar, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    public void volar(){
        System.out.println("Estoy volando");
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas + super.toString()+ '}';
    }
    
    
    
}
