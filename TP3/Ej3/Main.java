package TP3.Ej3;

public class Main {
    public static void main(String[] args) {
        Rueda rueda= new Rueda();
        Hamaca hamaca= new Hamaca();
        Comida comida= new Comida();
        Thread [] hamsters= new Thread[3];

        for (int i = 0; i <3; i++) {
            hamsters[i]= new Thread (new Hamster(comida, hamaca, rueda));
            hamsters[i].start();
        }

    }
}
