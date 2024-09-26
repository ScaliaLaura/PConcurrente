package EjemplosRunnable;

public class TestRunAlfaBeta {

    public static void main(String[] args) {
        RunnableAlfaBeta alfaBetaRunnable = new RunnableAlfaBeta();
        Thread alfa = new Thread(alfaBetaRunnable, "Hilo ALFA");
        Thread beta = new Thread(alfaBetaRunnable);
        beta.setName("Hilo Beta");
        alfa.start();
        beta.start();
    }

}
