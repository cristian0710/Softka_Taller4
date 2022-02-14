package Ejercicio_3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int num = 0;
        int num2;


        System.out.println("seleccione cantidad numeros aleatorios");
        num2 = sc.nextInt();
        int[] ve = new int[num2];
        for (int i = 0; i <= ve.length - 1; i++){
            int randomNumber=(random.nextInt(65536)-32768);
            ve[i] = randomNumber;
            System.out.println(i+ ": "+ve[i]);
        }

        System.out.println("Seleccione el metodo de ordenamiento: 1.Borbuja 2.Sort");
        num = sc.nextInt();
        if (num == 1){
            for (int x = 0; x < ve.length; x++) {
                // Aquí "y" se detiene antes de llegar
                // a length - 1 porque dentro del for, accedemos
                // al siguiente elemento con el índice actual + 1
                for (int y = 0; y < ve.length - 1; y++) {
                    int elementoActual = ve[y], elementoSiguiente = ve[y + 1];
                    if (elementoActual > elementoSiguiente) {
                        // Intercambiar
                        ve[y] = elementoSiguiente;
                        ve[y + 1] = elementoActual;
                    }
                }
            }
            System.out.println("Vector ordenado por Burbuja");
            for(int i = 0; i <= ve.length - 1; i++){
                System.out.println(ve[i]);
            }
        }else{
            Arrays.sort(ve);
            System.out.println("Vector ordenado por Sort");
            for(int i = 0; i <= ve.length - 1; i++){
                System.out.println(ve[i]);
            }
        }



    }



}
