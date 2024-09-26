package TP3.Ej3;

public class Hamaca {
    //Recurso compartido
    private boolean ocupado;

    public Hamaca() {
        this.ocupado = false;
    }

    public synchronized void hamaca() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " esta hamacandose");

        Thread.sleep(1000);
    }
}
