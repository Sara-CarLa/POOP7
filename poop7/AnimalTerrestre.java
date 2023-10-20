/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Usuario
 * Clase que guarda información de un Animal Terrestre
 */
public class AnimalTerrestre extends Animal {
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public AnimalTerrestre(int numeroPatas, String nombre, String lugar, String color) {
        super(nombre, lugar, color);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + super.toString()+ '}';
    }
    
    
    
}
