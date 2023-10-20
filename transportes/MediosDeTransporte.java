/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Cardenas Lagui Sara Alejandra
 * Clase superior que guarda datos de las otras clases heredadas de las clases de transportes
 */
public class MediosDeTransporte extends Object {
    private String nombre, color, pais;

    /**
     * Constructor vacio
     */
    public MediosDeTransporte() {
    }

    /**
     * Constrictor lleno
     * @param nombre nombre del medio de transporte
     * @param color color del medio de transporte
     * @param pais país del medio de transporte
     */
    public MediosDeTransporte(String nombre, String color, String pais) {
        this.nombre = nombre;
        this.color = color;
        this.pais = pais;
    }

    /**
     * Metodo get
     * @return regresa el nombre del medio de transporte
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set que recibe como parametro el nombre del medio de transporte
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get
     * @return regresa el color del medio de transporte
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo get que recibe como parametro el color del medio de transporte
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo get
     * @return regresa el pais del medio de transporte
     */
    public String getPais() {
        return pais;
    }

    /**
     * Metodo set que recibe como parametro el pais del medio de transporte de tipo String
     * @param pais 
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    /**
     * Metodo que indica cuando se desplaza el medio de transporte
     * @param metros 
     */
    public void desplazar(int metros){
        System.out.println("Me estoy desplaszando "+ metros+ " metros");
    }
    
    /**
     * Metodo que indida la velocidad que tiene el medio de transporte
     * @param kilometros 
     */
    public void velocidad (int kilometros){
        System.out.println("Estoy a una velocidad de "+ kilometros + "por hora");
    }
    
    /**
     * Metodo que indica que esta distribuyendo el medio de transporte
     */
    public void distribuir (){
        System.out.println("Distribullo personas y paquetes");
    }

    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "MediosDeTransporte{" + "nombre=" + nombre + ", color=" + color + ", pais=" + pais + '}';
    }
    
   }
