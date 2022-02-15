package Ejercicio_4;

import java.util.Date;

/**
 * @author Cristian Duran M
 */
public class Vehiculo {
    /**
     * Atributos de la  clase
     */
    private boolean on; //Motor en marcha
    private int pass;
    private boolean crew; //tripulacion
    private int wheels;
    private String regist;
    private String displace; //Medio que se desplaza
    private String color;

    /**
     * Constructor de la clase
     * @param pass
     * @param wheels
     * @param regist
     * @param displace
     * @param color
     */
    public Vehiculo(int pass, int wheels, String regist, String displace, String color) {
        this.pass = pass;
        this.wheels = wheels;
        this.regist = regist;
        this.displace = displace;
        this.color = color;
        this.on = false;
    }

    /**
     * Metodos para encender el vehiculo
     */
    public void enginerOn(){
        this.on = true;
    }

    public void engineroff(){
        this.on = false;
    }
    /**
     * Metodos para apagar el vehiculo
     */
    public void climbPass(int pass){
        this.pass += pass;
    }

    /**
     * Metodo para dejar pasajero
     * @param pass
     */
    public void downPass(int pass){
        this.pass -= pass;
    }

    /**
     * Metodo para saber si hay tripulantes
     * @return
     */
    public boolean CrewOn(){
        if (this.pass > 0){
            return this.crew = true;
        }else{
            return this.crew = false;
        }
    }

    /**
     * Metodo para mostrar datos del objeto
     * @return
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "Encendido= " + on +
                ", Pasajeros= " + pass +
                ", Tripulacion= " + crew +
                ", Total ruedas= " + wheels +
                ", Fecha registro= " + regist +
                ", Tipo desplazamiento= '" + displace + '\'' +
                ", color = '" + color + '\'' +
                '}';
    }
}
