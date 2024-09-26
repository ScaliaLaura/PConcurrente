package TP2;

public class Cliente extends Thread {

    public void run() {
        System.out.println("soy" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        };Recurso.uso();
    }
;
}
