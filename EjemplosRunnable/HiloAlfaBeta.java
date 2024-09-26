package EjemplosRunnable;

public class HiloAlfaBeta extends Thread {
    // completar con constructores
    private String nombre;

    public HiloAlfaBeta(String cartel) {
        nombre = cartel;
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(this.getName() + "en ejecucion");
        }
    }
}
