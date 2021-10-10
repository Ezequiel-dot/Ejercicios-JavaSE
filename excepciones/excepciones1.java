package excepciones;

import java.util.*;

public class excepciones1 {
    public static void main(String[] args) {
        System.out.println("Que desead hacer:" );
        System.out.println("1-Salir del programa." );
        System.out.println("2-Realizar el programa." );

        Scanner entrada=new Scanner(System.in);
        int desicion=entrada.nextInt();

        if(desicion==1){
            System.out.println("Adios");
        }
        if(desicion==2){
            pedirDatos();
        }
        entrada.close();
    }
    static void pedirDatos() throws InputMismatchException{
        try{
        Scanner entrada=new Scanner(System.in);
    
        System.out.println("Como te llamas?");
        String nombre=entrada.next();
        System.out.println("Cuantos años tienes?");
        int edad=entrada.nextInt();
        System.out.println("Hola "+nombre+" el año que viente tendras "+(edad+1) +" años");
        entrada.close();    
        }catch(InputMismatchException e){
            System.out.println("Introduciste cualquier cosa");
        }
        
    }
}