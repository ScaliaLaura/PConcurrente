package EjemplosRunnable;

public class TestPingPongThread {

    public static void main(String[] args) {
        PingPongThread t1 = new PingPongThread("PING", 33);
        PingPongThread t2 = new PingPongThread("PONG", 10);
        // Activación
        t1.start();
        t2.start();
        // Espera unos segundos
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Error: interrupcion");
        };
        // Finaliza la ejecución de los threads
    }

}
