package TP3.Ej4;

public class Main {

    public static void main(String[] args) {
        /*Los visitantes pueden reservar libremente
        entre las areas pero no mas de 1 vez en la misma*/

        Parque disponibilidad = new Parque();
        Thread[] visitantes = new Thread[20];

        for (int i = 0; i < 20; i++) {
            visitantes[i] = new Thread(new Visitante(disponibilidad));
            visitantes[i].start();
        }
    }

}
