/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Cardenas Lagui Sara Alejandra
 * Clase que guarda infoemación sobre una combi que es heredada de clase Supraterraneo
 */
public class Combi extends Supraterraneo{
    private int costo, numRuta;
    private String modelo;

    /**
     * Constructor vacío
     */
    public Combi() {
    }

    /**
     * Constructor lleno
     * @param costo costo del pasaje 
     * @param numRuta numero de ruta de la combi
     * @param modelo modelo de la combi
     */
    public Combi(int costo, int numRuta, String modelo) {
        this.costo = costo;
        this.numRuta = numRuta;
        this.modelo = modelo;
    }

    public Combi(int costo, int numRuta, String modelo, int llantas, int kilometraje, float tiempo) {
        super(llantas, kilometraje, tiempo);
        this.costo = costo;
        this.numRuta = numRuta;
        this.modelo = modelo;
    }

    public Combi(int costo, int numRuta, String modelo, int llantas, int kilometraje, float tiempo, int asientos, int ventanas, int personas) {
        super(llantas, kilometraje, tiempo, asientos, ventanas, personas);
        this.costo = costo;
        this.numRuta = numRuta;
        this.modelo = modelo;
    }

    /**
     * Constructor lleno con todos los atributos de las clases superiores
     * @param costo costo del pasaje de la combi
     * @param numRuta numero de ruta de la cobi
     * @param modelo modelo de la combi
     * @param llantas numero de llantas que tiene la combi
     * @param kilometraje kilometraje con el que cuenta la combi
     * @param tiempo tiempo de espera de la combi
     * @param asientos numero de asientos con los que cuenta la combi
     * @param ventanas numero de ventanas que tiene la combi
     * @param personas personas que estan abordando la combi
     * @param nombre nombre del medio de transporte
     * @param color color de la combi
     * @param pais país de los datos de la combi
     */
    public Combi(int costo, int numRuta, String modelo, int llantas, int kilometraje, float tiempo, int asientos, int ventanas, int personas, String nombre, String color, String pais) {
        super(llantas, kilometraje, tiempo, asientos, ventanas, personas, nombre, color, pais);
        this.costo = costo;
        this.numRuta = numRuta;
        this.modelo = modelo;
    }

    /**
     * Método get
     * @return regresa el costo del pasaje de la combi
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Método set que recibe el costo del pasaje de tipo int
     * @param costo 
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Método get
     * @return regresa el número de ruta de la combi
     */
    public int getNumRuta() {
        return numRuta;
    }

    /**
     * Método set que tiene como parametro el numero de ruta de tipo int
     * @param numRuta 
     */
    public void setNumRuta(int numRuta) {
        this.numRuta = numRuta;
    }

    /**
     * Metodo get
     * @return regresa el modelo de la combi
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo set que recibe como paramtero el modelo de la combi de tipo String
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Método que indica que avanza la combi
     */
    public void avanzar(){
        System.out.println("Voy a avanzar hasta que hagan parada");
    }
    /**
     * Metodo que incdica cuando frena la combi
     */
    public void frenar(){
        System.out.println("Frené porque alguien hizo parada");
    }
    /**
     * Metodo que indica cuando abre la combi
     */
    public void abrir(){
        System.out.println("Abrí mis puertas poque una persona va a subir");
    }

    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Combi{" + "costo=" + costo + ", numRuta=" + numRuta + ", modelo=" + modelo + super.toString() + '}';
    }
    
    
    
}
