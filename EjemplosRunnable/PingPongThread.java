package EjemplosRunnable;

public class PingPongThread extends Thread {

    private String cadena; // Lo que va a escribir.
    private int delay; // Tiempo entre escritura

    public PingPongThread(String cartel, int cantMs) {
        cadena = cartel;
        delay = cantMs;
    }

    ;
    public void run() {
        for (int i = 1; i < delay * 10; i++) {
            System.out.print(cadena + "");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Error: interrumpido");
            }
        }
    } //fin método run() 
} //fin clase PingPongThread
