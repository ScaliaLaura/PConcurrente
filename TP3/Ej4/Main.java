package TP3.Ej4;

public class Main {

    public static void main(String[] args) {
        // como hacer para que reserven en mas de uno 
        //si quieren? o que se jodan dea
        
        Parque disponibilidad= new Parque();
        Thread[] visitantes= new Thread[20];
        
        for (int i=0; i<20;i++){
            visitantes[i]= new Thread (new Visitante(disponibilidad));
            visitantes[i].start();
        }
    }
    
}
