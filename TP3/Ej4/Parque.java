package TP3.Ej4;

public class Parque {

    //Recurso compartido
    private int cupoMontania;
    private int cupoAutitos;
    private int cupoKamikaze;

    public Parque() {
        cupoMontania = 100;
        cupoAutitos = 50;
        cupoKamikaze = 30;
    }

    public synchronized boolean usarAutitos(int unNum) {
        boolean r = false;
        if (cupoAutitos > 0 && cupoAutitos > unNum) {
            this.cupoAutitos = this.cupoAutitos - unNum;
            System.out.println(Thread.currentThread().getName()
                    + " pudo reservar en los Autitos");
            r = true;
        }
        return r;
    }

    public synchronized boolean usarKamikaze(int unNum) {
        boolean r = false;
        if (cupoKamikaze > 0 && cupoKamikaze > unNum) {
            this.cupoKamikaze = this.cupoKamikaze - unNum;
            System.out.println(Thread.currentThread().getName()
                    + " pudo reservar en el Kamikaze");
            r = true;
        }
        return r;
    }

    public synchronized boolean usarMontania(int unNum) {
        boolean r = false;
        if (cupoMontania > 0 && cupoMontania > unNum) {
            this.cupoMontania = this.cupoMontania - unNum;
            System.out.println(Thread.currentThread().getName()
                    + " pudo reservar en la Montania Rusa");
            r = true;
        }
        return r;
    }
}
