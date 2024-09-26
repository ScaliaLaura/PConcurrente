package TP3.Ej3;

public class Comida {
    //Recurso compartido
    private boolean ocupado ;

    public Comida() {
        this.ocupado= false;
    }

    public synchronized void comida() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " esta comiendo");

        Thread.sleep(1000);
    }
}
