package TP3.Ej2;

public class Energia {
    //Recurso compartido
    private int cant = 10;

    public Energia() {

    }

    public synchronized void drenar() {
        cant = cant - 3;
        System.out.println(Thread.currentThread().getName()+" disminuyo 3: "+ cant);
    }

    public synchronized void aumentar() {
        cant = cant + 3;
        System.out.println(Thread.currentThread().getName()+" aumento 3: "+ cant);
    }

}
