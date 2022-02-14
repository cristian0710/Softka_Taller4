package Ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Cristian Duran M
 */
public class Main {
    /**
     * Metodo principal para menu de opciones
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Planet> listPlanet = new ArrayList<>(); //Lista de objetos de tipo Planeta
        boolean stop = true; //variable de control del ciclo while
        String nombre;
        String masa;
        String densidad;
        String diametro;
        String distancia;
        String planeta1;
        String planeta2;
        int cont = 1;
        /**
         * Ciclo while para crear cantidad de planetas ilimitados y metodos para calcular el radio
         * y fuerza gravitacional entre dos planetas de la lista
         */
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
            Planet planet = new Planet(nombre, masaDouble, densidad, diametro, masaDistancia); //Creacion de objeto Planeta
            listPlanet.add(planet); //Se agrega un objeto tipo planeta al ArrayList

            //Esta condicion evalua si hay mas de un objeto creado para poder calcular el radio y la fuerza entre dos objetos tipo planeta
            if (cont > 1){
                System.out.println("Calcular la atraccion gravitacional de dos planetas");
                System.out.println("Planetas creados");
                int i = 1;
                //For que recorre el Arraylist para mostrar los planetas creados
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
                /**
                 * Se invoca funcion para calcular el radio entre los dos planetas
                 */
                listPlanet.get(numPlaneta1).distanceRadio(listPlanet.get(numPlaneta2).getDistance());
                /**
                 * Funcion que devuelve y se imprime en pantalla el valor de la fuerza gravitacional
                 * entre los dos planetas seleccionados
                 */
                System.out.println("La fuerza gravitacional es: "
                        +listPlanet.get(numPlaneta1).forceGravity(listPlanet.get(numPlaneta2).getMass()));

            }
            System.out.println(listPlanet.toString());
            cont ++;
            /**
             * Funcion de control para seguir creando planetas o terminar el ciclo while
             */
            System.out.println("Desea agregar mas planetas: 1.Si o 2.No");
            nombre = sc.nextLine();
            int num = Integer.parseInt(nombre);
            if (num == 1){
                stop = true;
            }else{
                stop = false;
            }

        }

    }
}
