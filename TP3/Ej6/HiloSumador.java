package TP3.Ej6;

public class HiloSumador implements Runnable {

    /*Hilo que suma por segmento de un 
    arreglo dado anteriormente*/
    private int subtotal;
    private int inicio;
    private int fin;
    private int[] arreglo;
    private Sumador sum;

    public HiloSumador(int i, int f, int[] unArr, Sumador s) {
        this.subtotal = 0;
        this.inicio = i;
        this.fin = f;
        this.arreglo = unArr;
        this.sum = s;
    }

    public void run() {
        try {
            while (inicio <= fin) {
                subtotal += arreglo[inicio];
                inicio++;
            }
            sum.sumar(subtotal);
            System.out.println(Thread.currentThread().getName() + " sumo: " + subtotal);
        } catch (Exception e) {
            //Normalmente no va nada aca, es para probar
            System.out.println("Error");
        }
    }
}
