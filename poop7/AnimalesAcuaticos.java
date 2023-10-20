/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Cardenas Lagui Sara Alejandra
 * Clase que guarda información de un Animal Acuatico
 */
public class AnimalesAcuaticos extends Animal {
    /**
     * nombre: nombre del amial
     * lugar: lugar de origen del animal
     * color: color del animal
     */
    private String nombre, lugar, color;

    /**
     * Constructor vacio
     */
    public AnimalesAcuaticos() {    
    }

    /**
     * Constructor lleno
     * @param nombre nombre del animal
     * @param lugar lugar de origen del animal
     * @param color color del animal
     */
    public AnimalesAcuaticos(String nombre, String lugar, String color) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.color = color;
    }
    
    /**
     * Metodo get nombre
     * @return devuelve el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recibe como paramtero un nombre de tipo String
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get lugar
     * @return devuelve el lugar de origen
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Recibe como parametro el lugar de origen de tipo String
     * @param lugar lugar de origen
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void hacerSonido (String sonido){
        System.out.println("Sonido:"+ sonido);
    }
    
    public void comer(){
        System.out.println("Estoy comiendo...");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugar=" + lugar + ", color=" + color + super.toString()+ '}';
    }
    
}
