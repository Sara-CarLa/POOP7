/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Cardenas Lagui Sara Alejandra
 * Clase que guarda la información de una ballena tomando en cuenta que tiene herencia de un animal acuatico
 */
public class Ballena extends AnimalesAcuaticos {
    
    private int largo;

    public Ballena() {
    }

    public Ballena(int largo) {
        this.largo = largo;
    }

    public Ballena(int largo, String nombre, String lugar, String color) {
        super(nombre, lugar, color);
        this.largo = largo;
    }

    

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public void pelearConPincocho(){
        System.out.println("Estoy peleando");
    }

    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + super.toString() + '}';
    }
}
