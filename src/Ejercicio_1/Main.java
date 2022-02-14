package Ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Planet> listPlanet = new ArrayList<Planet>();
        boolean stop = true;
        String nombre;
        String masa;
        String densidad;
        String diametro;
        String distancia;
        String planeta1;
        String planeta2;
        int cont = 1;

        while(stop){
            System.out.println("ingrese nombre del planeta: ");
            nombre = sc.nextLine();
            System.out.println("ingrese densidad del planeta: ");
            densidad = sc.nextLine();
            System.out.println("ingrese diametro del planeta: ");
            diametro = sc.nextLine();
            System.out.println("ingrese la masa del planeta: ");
            masa = sc.nextLine();
            Double masaDouble = Double.parseDouble(masa);
            System.out.println("ingrese la distancia del radio con el sol: ");
            distancia = sc.nextLine();
            double masaDistancia = Double.parseDouble(distancia);
            Planet planet = new Planet(nombre, masaDouble, densidad, diametro, masaDistancia);
            listPlanet.add(planet);

            if (cont > 1){
                System.out.println("Calcular la atraccion gravitacional de dos planetas");
                System.out.println("Planetas creados");
                int i = 1;
                int a = 0;
                int b = 0;
                for(Planet list: listPlanet){
                    System.out.println("Planeta "+i+": "+list.getName());
                    i ++;
                }
                System.out.println("Escriba numero del primer planeta: ");
                planeta1 = sc.nextLine();
                int numPlaneta1 = Integer.parseInt(planeta1);
                System.out.println("Escriba numero del segundo planeta: ");
                planeta2 = sc.nextLine();
                int numPlaneta2 = Integer.parseInt(planeta2);
                numPlaneta1 -= 1;
                numPlaneta2 -= 1;
                listPlanet.get(numPlaneta1).distanceRadio(listPlanet.get(numPlaneta2).getDistance());
                System.out.println("La fuerza gravitacional es: "
                        +listPlanet.get(numPlaneta1).forceGravity(listPlanet.get(numPlaneta2).getMass()));

            }
            System.out.println(listPlanet.toString());
            cont ++;
            System.out.println("Desea agregar mas planetas: 1.Si o 2.No");
            nombre = sc.nextLine();
            int num = Integer.parseInt(nombre);
            if (num == 1){
                stop = true;
            }else{
                stop = false;
            }
            System.out.println(stop + nombre);


        }



    }
}
