package TP1;

public class PruebaExcep {
  
    public static void edad(int edad){
        try{
            if(edad<18){
                throw new Exception();
            }
        }catch(Exception e){
            System.err.println("Error");
        }
    }
}
