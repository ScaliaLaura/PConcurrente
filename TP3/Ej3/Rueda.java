package TP3.Ej3;

public class Rueda {
    //Recurso compartido
    private boolean ocupado;

    public Rueda() {
        this.ocupado = false;
    }

    public synchronized void rueda() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " esta corriendo");

        Thread.sleep(1000);
    }

}
