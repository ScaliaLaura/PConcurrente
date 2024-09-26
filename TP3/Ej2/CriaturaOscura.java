package TP3.Ej2;

public class CriaturaOscura implements Runnable {

    private Energia energia;

    public CriaturaOscura(Energia unaEner) {
        this.energia = unaEner;
        
    }

    public void run() {
        while (true) {
            energia.drenar();
        }
    }
}
