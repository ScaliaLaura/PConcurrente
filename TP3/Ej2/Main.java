package TP3.Ej2;

public class Main {

    public static void main(String[] args) {
        Energia e = new Energia();
        CriaturaOscura h1= new CriaturaOscura(e);
        Sanador h2= new Sanador(e);
        Thread h3= new Thread(h1);
        Thread h4= new Thread(h2);
        h3.start();
        h4.start();
    }

}
