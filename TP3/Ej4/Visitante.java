package TP3.Ej4;

import java.util.Random;

public class Visitante implements Runnable {

    private Parque parque;

    public Visitante(Parque unCupo) {
        this.parque = unCupo;
    }

    public void run() {
        boolean a = false, k = false, m = false;
        while (!a && !k && !m) { //condicion: las banderas todas en true y que corte
            Random ran = new Random();
            int numero = ran.nextInt(3) + 1;
            int x = ran.nextInt(7) + 1;
            try {
                switch (numero) {
                    case 1:
                        a = parque.usarAutitos(x);
                        //poner bandera en true
                        break;
                    case 2:
                        k = parque.usarKamikaze(x);
                        break;
                    case 3:
                        m = parque.usarMontania(x);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error tarada");
            }
        }
    }
}
