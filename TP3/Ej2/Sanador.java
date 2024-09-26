package TP3.Ej2;

public class Sanador implements Runnable {

    private Energia energia;

    public Sanador(Energia unaEner) {
        this.energia = unaEner;
        
    }

    public void run() {
        while (true) {
            energia.aumentar();
        }
    }
}

