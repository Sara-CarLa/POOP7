/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Usuario
 */
public class Subterraneo extends Terrestres {
    private int vagones, estaciones, capacidad;

    public Subterraneo() {
    }

    public Subterraneo(int vagones, int estaciones, int capacidad) {
        this.vagones = vagones;
        this.estaciones = estaciones;
        this.capacidad = capacidad;
    }

    public Subterraneo(int vagones, int estaciones, int capacidad, int asientos, int ventanas, int personas) {
        super(asientos, ventanas, personas);
        this.vagones = vagones;
        this.estaciones = estaciones;
        this.capacidad = capacidad;
    }

    public Subterraneo(int vagones, int estaciones, int capacidad, int asientos, int ventanas, int personas, String nombre, String color, String pais) {
        super(asientos, ventanas, personas, nombre, color, pais);
        this.vagones = vagones;
        this.estaciones = estaciones;
        this.capacidad = capacidad;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }

    public int getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(int estaciones) {
        this.estaciones = estaciones;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void avanzar(){
        System.out.println("Estoy avanzando");
    }
    
    public void salir(){
        System.out.println("Estoy saliendo de la estación");
    }
    
    public void detener(){
        System.out.println("Me detuve en la estación");
    }

    @Override
    public String toString() {
        return "Subterraneo{" + "vagones=" + vagones + ", estaciones=" + estaciones + ", capacidad=" + capacidad + super.toString() + '}';
    }
    
    
    
}
