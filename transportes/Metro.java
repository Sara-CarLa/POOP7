/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportes;

/**
 *
 * @author Cárdenas Lagui Sara Alejandra
 */
public class Metro extends Subterraneo{
    private int lineas;
    private String estacion, colorLinea;

    /**
     * Constructor vacio
     */
    public Metro() {
    }

    public Metro(int lineas, String estacion, String colorLinea) {
        this.lineas = lineas;
        this.estacion = estacion;
        this.colorLinea = colorLinea;
    }

    public Metro(int lineas, String estacion, String colorLinea, int vagones, int estaciones, int capacidad) {
        super(vagones, estaciones, capacidad);
        this.lineas = lineas;
        this.estacion = estacion;
        this.colorLinea = colorLinea;
    }

    public Metro(int lineas, String estacion, String colorLinea, int vagones, int estaciones, int capacidad, int asientos, int ventanas, int personas) {
        super(vagones, estaciones, capacidad, asientos, ventanas, personas);
        this.lineas = lineas;
        this.estacion = estacion;
        this.colorLinea = colorLinea;
    }

    /**
     * Constructor lleno junto con los atributos de la clase superior
     * @param lineas lineas del metro con las que cuenta el metro
     * @param estacion estacion en la que se encuantra el metro
     * @param colorLinea color de la linea del metro
     * @param vagones numero de vagones que tiene el metro
     * @param estaciones estaciones con las que cuenta la linea del metro
     * @param capacidad capacidad total con la que cuenta el metro
     * @param asientos asientos totales con los que cuenta el metro
     * @param ventanas ventanas con las que cuenta el metro
     * @param personas personas que estan abordo del metro
     * @param nombre
     * @param color
     * @param pais 
     */
    public Metro(int lineas, String estacion, String colorLinea, int vagones, int estaciones, int capacidad, int asientos, int ventanas, int personas, String nombre, String color, String pais) {
        super(vagones, estaciones, capacidad, asientos, ventanas, personas, nombre, color, pais);
        this.lineas = lineas;
        this.estacion = estacion;
        this.colorLinea = colorLinea;
    }

    /**
     * Metodo get
     * @return regresa 
     */
    public int getLineas() {
        return lineas;
    }

    public void setIneas(int ineas) {
        this.lineas = ineas;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    public void detener (String estacion){
        System.out.println("Me detuve en la estacion: " + estacion);
    }
    
    public void prender(){
        System.out.println("Me estoy prendiendo");
    }
    
    public void acelerar(){
        System.out.println("Estoy acelerando");
    }

    @Override
    public String toString() {
        return "Metro{" + "ineas=" + lineas + ", estacion=" + estacion + ", colorLinea=" + colorLinea + super.toString() + '}';
    }

    
    


    
    
}
