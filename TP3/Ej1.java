package TP3;

public class Ej1 {

    public static void main(String[] args) {
        VerificarCuenta vc = new VerificarCuenta();
        Thread Luis = new Thread(vc, "Luis ");
        Thread Manuel = new Thread(vc, "Manuel ");
        Luis.start();
        Manuel.start();
    }
}
