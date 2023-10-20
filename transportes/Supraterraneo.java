/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Cardenas Lagui Sara Alejandra
 */
public class Supraterraneo extends Terrestres {
    private int llantas, kilometraje;
    private float tiempo;

    public Supraterraneo() {
    }

    public Supraterraneo(int llantas, int kilometraje, float tiempo) {
        this.llantas = llantas;
        this.kilometraje = kilometraje;
        this.tiempo = tiempo;
    }

    public Supraterraneo(int llantas, int kilometraje, float tiempo, int asientos, int ventanas, int personas) {
        super(asientos, ventanas, personas);
        this.llantas = llantas;
        this.kilometraje = kilometraje;
        this.tiempo = tiempo;
    }

    public Supraterraneo(int llantas, int kilometraje, float tiempo, int asientos, int ventanas, int personas, String nombre, String color, String pais) {
        super(asientos, ventanas, personas, nombre, color, pais);
        this.llantas = llantas;
        this.kilometraje = kilometraje;
        this.tiempo = tiempo;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    public void parar(){
        System.out.println("Voy a recoger a un pasajero");
    }
    
    public void transportar(int pasajeros){
        System.out.println("Estroy transportando "+ pasajeros + "pasajeros");
    }
    
    public void llegar (int minutos){
        System.out.println("Llego en " + minutos+ "minutos");
    }

    @Override
    public String toString() {
        return "Supraterraneo{" + "llantas=" + llantas + ", kilometraje=" + kilometraje 
                + ", tiempo=" + tiempo + super.toString() +'}';
    }
    
    
    
}
