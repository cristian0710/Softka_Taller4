package Ejercicio_4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Cristian Duran M
 */
public class Main {
    /**
     * Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        //Lista donde se almacenan los objetos de tipo Vehiculo
        ArrayList<Vehiculo> listVehiculo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String pasajeros;
        String ruedas;
        String fecha;
        String desplazamiento;
        String color;
        String num;
        boolean cont = true;
        /**
         * Ciclo while para creacion ilimitada de objetos tipo Vehiculo
         */
        while (cont){
            /**
             * Captura de datos del usuario
             */
            System.out.println("Crear vehiculo \n");
            System.out.println("cantidad pasajeros: ");
            pasajeros = sc.nextLine();
            int pasajerosInt = Integer.parseInt(pasajeros);
            System.out.println("cantidad ruedas: ");
            ruedas = sc.nextLine();
            int ruedasInt = Integer.parseInt(ruedas);
            System.out.println("Fecha registro: ");
            fecha = sc.nextLine();
            System.out.println("Medio de desplazamiento: ");
            desplazamiento = sc.nextLine();
            System.out.println("Color: ");
            color = sc.nextLine();
            //Se crea el objeto tipo vehiculo
            Vehiculo vehiculo = new Vehiculo(pasajerosInt, ruedasInt, fecha, desplazamiento, color);
            //Se almacena el objeto tipo vehiculo en el ArrayList
            listVehiculo.add(vehiculo);
            //Sentencia if para seguir creando vehiculos hasta que el usuario lo desee
            System.out.println("Desea ingresar mas vehiculos: 1.Si 2.No");
            num = sc.nextLine();
            int numInt = Integer.parseInt(num);
            if (numInt == 1){
                cont = true;
            }else{
                cont = false;
            }
        }

        System.out.println(listVehiculo.toString());


    }
}
