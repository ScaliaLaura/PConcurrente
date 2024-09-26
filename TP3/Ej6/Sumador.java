package TP3.Ej6;

public class Sumador {

    private int total;

    public Sumador() {
        this.total = 0;
    }

    public synchronized void sumar(int num) {
        total += num;
    }

    public synchronized int obtenerSuma() {
        return total;
    }
}
