package TP3.Ej3;

import java.util.Random;

public class Hamster implements Runnable {

    private Rueda r;
    private Comida c;
    private Hamaca h;

    public Hamster(Comida unaC, Hamaca unaH, Rueda unaR) {
        this.c = unaC;
        this.h = unaH;
        this.r = unaR;
    }

    public void run() {
        while (true) {
            Random ran = new Random();
            int numero = ran.nextInt(3) + 1;
            try {
                switch (numero) {
                    case 1:
                        c.comida();
                        break;
                    case 2:
                        r.rueda();
                        break;
                    case 3:
                        h.hamaca();
                        break;
                }
            } catch (Exception e) {

            }
        }
    }
}
