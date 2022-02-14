package Ejercicio_1;

import java.util.UUID;

public class Planet {
    UUID id;
    private String name;
    private double mass;
    private String density;
    private String diameter;
    private double distance;
    private double radio;
    private double gravity;
    static double gravityConst = 6.39E23;

    public Planet(String name, double mass, String density, String diameter, double distance) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distance = distance;
    }

    public void distanceRadio(double radio){
        if (this.distance > radio){
            this.radio = distance - radio;
        }else {
            this.radio = radio - distance;
        }
    }

    public double forceGravity(double mass){
        return this.gravity = (gravityConst * this.mass * mass) / Math.pow(this.radio, 2);
    }


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
