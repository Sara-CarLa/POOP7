/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Cárdenas Lagui Sara Alejandra
 * Clase que guarda la información de un pajaro, la clase es heredada de la clase Animal Aereo
 */
public class Pajaro extends AnimalAereo {
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public Pajaro(String tipoPico, int numeroAlas) {
        super(numeroAlas);
        this.tipoPico = tipoPico;
    }

    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugar, String color) {
        super(numeroAlas, nombre, lugar, color);
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas");
    }

    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + super.toString() + '}';
    }
   
}
