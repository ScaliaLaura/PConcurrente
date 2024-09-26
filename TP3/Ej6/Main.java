package TP3.Ej6;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        //arreglo con numeros random
        Sumador suma = new Sumador();
        int[] arreglo = new int[200];
        Random rand = new Random();
        int numero;
        for (int i = 0; i < arreglo.length; i++) {
            numero = rand.nextInt(10) + 1;// Genera un número entre 1 y 10
            arreglo[i] = numero;
        }
        //CAMBIAR por for con hilos sin nombre si anda, ver git de juan lol
        Thread[] arregloHilos = new Thread[3];
        HiloSumador h1 = new HiloSumador(0, 100, arreglo, suma);
        HiloSumador h2 = new HiloSumador(101, 150, arreglo, suma);
        HiloSumador h3 = new HiloSumador(151, arreglo.length - 1, arreglo, suma);
        arregloHilos[0] = new Thread(h1);
        arregloHilos[1] = new Thread(h2);
        arregloHilos[2] = new Thread(h3);
        arregloHilos[0].start();
        arregloHilos[1].start();
        arregloHilos[2].start();

        //Muy adecuado usar un for, imprementar en el codigo anterior
        /*join al arreglo de hilos para asegurar que
        terminen los hilos antes del total real*/
        
        for (int i = 0; i < 3; i++) {
            try {
                arregloHilos[i].join();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Total: " + suma.obtenerSuma());
    }

}
