/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Cardenas Lagui Sara Alejandra
 * Clase que guarda la información de un perro, la clase es heredada de la clase superior Animal Terrestre
 */
public class Perro extends AnimalTerrestre{
    private String colorCollar;

    public Perro() {
    }

    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public Perro(String colorCollar, int numeroPatas) {
        super(numeroPatas);
        this.colorCollar = colorCollar;
    }

    public Perro(String colorCollar, int numeroPatas, String nombre, String lugar, String color) {
        super(numeroPatas, nombre, lugar, color);
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    public void hacerTrucos(){
        System.out.println("Estoy haciendo un truco");
    }

    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + super.toString()+'}';
    }
    
    
    
}
