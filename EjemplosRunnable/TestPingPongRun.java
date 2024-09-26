package EjemplosRunnable;

public class TestPingPongRun {

    public static void main(String[] args) {
        // 2 objetos definen los métodos run
        PingPongThread o1 = new PingPongThread("PING", 33);
        PingPongThread o2 = new PingPongThread("PONG", 10);
        // Se crean los hilos
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        // se activan los hilos
        t1.start();
        t2.start();
    }

}
