/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Cárdenas Lagui Sara Alejandra
 */
public class Suburbano extends Terrestres{
    private int velocidad;
    private String estaciones, marca;

    public Suburbano() {
    }

    public Suburbano(int velocidad, String estaciones, String marca) {
        this.velocidad = velocidad;
        this.estaciones = estaciones;
        this.marca = marca;
    }

    public Suburbano(int velocidad, String estaciones, String marca, int asientos, int ventanas, int personas) {
        super(asientos, ventanas, personas);
        this.velocidad = velocidad;
        this.estaciones = estaciones;
        this.marca = marca;
    }

    public Suburbano(int velocidad, String estaciones, String marca, int asientos, int ventanas, int personas, String nombre, String color, String pais) {
        super(asientos, ventanas, personas, nombre, color, pais);
        this.velocidad = velocidad;
        this.estaciones = estaciones;
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(String estaciones) {
        this.estaciones = estaciones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void acelerar(){
        System.out.println("Estoy acelerando para avanzar");
    }
    
    public void detener(){
        System.out.println("Me detuve");
    }
    
    public void apagar(){
        System.out.println("Me estoy  apagando");
    }

    @Override
    public String toString() {
        return "Suburbano{" + "velocidad=" + velocidad + ", estaciones=" + estaciones + ", marca=" + marca + super.toString() + '}';
    }
    
    
    
}
