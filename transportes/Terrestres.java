/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Usuario
 */
public class Terrestres extends MediosDeTransporte {
    private int asientos,ventanas,personas;

    public Terrestres() {
    }

    public Terrestres(int asientos, int ventanas, int personas) {
        this.asientos = asientos;
        this.ventanas = ventanas;
        this.personas = personas;
    }

    public Terrestres(int asientos, int ventanas, int personas, String nombre, String color, String pais) {
        super(nombre, color, pais);
        this.asientos = asientos;
        this.ventanas = ventanas;
        this.personas = personas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }
    
    public void abrirVentanas(int ventanas){
        System.out.println("Tengo" + ventanas + "abiertas");
    }
    
    public void transportar (int kilometros){
        System.out.println("Llevo" + kilometros + "kilometros recorridos");
    }
    
    public void contarPersonas(int pasajeros){
        System.out.println("Llevo" + pasajeros + "pasajeros");   
    }

    @Override
    public String toString() {
        return "Terrestres{" + "asientos=" + asientos + ", ventanas=" + ventanas + 
                ", personas=" + personas + super.toString() + '}';
    }
    
    
}
