package Ejercicio_1;

import java.util.UUID;

/**
 * @author Cristian Duran M
 */
public class Planet {
    /**
     * Atributos de la clase Planeta
     */
    UUID id;
    private String name;
    private double mass;
    private String density;
    private String diameter;
    private double distance;
    private double radio;
    private double gravity;
    static double gravityConst = 6.39E23;

    /**
     * Constructor de la clase Planeta
     * @param name
     * @param mass
     * @param density
     * @param diameter
     * @param distance
     */
    public Planet(String name, double mass, String density, String diameter, double distance) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distance = distance;
    }

    /**
     * Metodo para calcular el radio de distancia entre el planeta1 y planeta2
     * @param radio
     */
    public void distanceRadio(double radio){
        if (this.distance > radio){
            this.radio = distance - radio;
        }else {
            this.radio = radio - distance;
        }
    }

    /**
     * Metodo que devuele la fuerza gravitacional entre el planeta1 y planeta2
     * @param mass
     * @return
     */
    public double forceGravity(double mass){
        return this.gravity = (gravityConst * this.mass * mass) / Math.pow(this.radio, 2);
    }

    /**
     * Metodos get de la clase
     * @return
     */
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public String getDensity() {
        return density;
    }

    public String getDiameter() {
        return diameter;
    }

    public double getDistance() {
        return distance;
    }

    /**
     * Metodo toString para imprimir los valores del planeta
     * @return
     */
    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", density='" + density + '\'' +
                ", diameter='" + diameter + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
