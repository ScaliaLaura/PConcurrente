package TP3.Ej4;

import java.util.Random;

public class Visitante implements Runnable {

    private Parque parque;

    public Visitante(Parque unCupo) {
        this.parque = unCupo;
    }

    public void run() {
        boolean a = false, k = false, m = false;
        boolean[] ejecutado = new boolean[3]; 
        // Arreglo que asegura si se ejecutaron los case
        Random ran = new Random();
        while (!a || !k || !m) {
            int numero;
            do {
                numero = ran.nextInt(3) + 1;
            } while (ejecutado[numero - 1]); 
            /* Asegura que el case no se ejecuto antes.
            Si el caso ha sido ejecutado (ejecutado[n]=true), 
            el bucle se repite y se genera un nuevo numero aleatorio */
            int x = ran.nextInt(7) + 1;
            try {
                switch (numero) {
                    case 1:
                        a = parque.usarAutitos(x);
                        ejecutado[0] = true; 
                        break;
                    case 2:
                        k = parque.usarKamikaze(x);
                        ejecutado[1] = true;
                        break;
                    case 3:
                        m = parque.usarMontania(x);
                        ejecutado[2] = true; 
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error tarada");
            }
            /*while (!a || !k || !m) {
            Random ran = new Random();
            // se duplica :(
            int numero = ran.nextInt(3) + 1;
            if (a) {
                numero = ran.nextInt(2) + 2;
            } else if (k) {
                numero = ran.nextInt(2) * 2 + 1;
            } else {
                numero = ran.nextInt(2) + 1;
            }*/
        }
    }
}
