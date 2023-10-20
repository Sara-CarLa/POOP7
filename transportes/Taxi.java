/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Cárdenas Lagui Sara Alejandra
 */
public class Taxi extends Supraterraneo {
    
    private int pasajeros;
    private String lugarDeBase, tipo;

    public Taxi() {
    }

    public Taxi(int pasajeros, String lugarDeBase, String tipo) {
        this.pasajeros = pasajeros;
        this.lugarDeBase = lugarDeBase;
        this.tipo = tipo;
    }

    public Taxi(int pasajeros, String lugarDeBase, String tipo, int llantas, int kilometraje, float tiempo) {
        super(llantas, kilometraje, tiempo);
        this.pasajeros = pasajeros;
        this.lugarDeBase = lugarDeBase;
        this.tipo = tipo;
    }

    public Taxi(int pasajeros, String lugarDeBase, String tipo, int llantas, int kilometraje, float tiempo, int asientos, int ventanas, int personas) {
        super(llantas, kilometraje, tiempo, asientos, ventanas, personas);
        this.pasajeros = pasajeros;
        this.lugarDeBase = lugarDeBase;
        this.tipo = tipo;
    }

    public Taxi(int pasajeros, String lugarDeBase, String tipo, int llantas, int kilometraje, float tiempo, int asientos, int ventanas, int personas, String nombre, String color, String pais) {
        super(llantas, kilometraje, tiempo, asientos, ventanas, personas, nombre, color, pais);
        this.pasajeros = pasajeros;
        this.lugarDeBase = lugarDeBase;
        this.tipo = tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getLugarDeBase() {
        return lugarDeBase;
    }

    public void setLugarDeBase(String lugarDeBase) {
        this.lugarDeBase = lugarDeBase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void subirPasajeros() {
        System.out.println("Voy a subir pasajeros");
    }
    
    public void cobrar(int pesos){
        System.out.println("Voy a cobrar "+ pesos+ "pesos al pasajero");
    }
    
    public void darCambio(){
        System.out.println("Dare el cambio al pasajero");
    }

    @Override
    public String toString() {
        return "Taxi{" + "pasajeros=" + pasajeros + ", lugarDeBase=" + lugarDeBase + ", tipo=" + tipo + super.toString() + '}';
    }

    


    
    
    
}
