import java.util.Scanner;

public class E_bucles2 {
    public static void main(String[] args) throws Exception {

        int aleatorio=(int)(Math.random()*100);
      
        //System.out.print(aleatorio);

        int numero=0;
        int intentos=0;
        Scanner entrada=new Scanner(System.in);
        
        while(aleatorio!=numero){
            intentos++;
            
            System.out.println("Introduzca un numero");
            numero=entrada.nextInt();

            if(numero>aleatorio){
                System.out.println("Más bajo");
            }
            if(numero<aleatorio){
                System.out.println("Más alto");
            }

        }
System.out.println("EL NUMERO INGRESADO HA COINCIDIDO, lo hiciste en "+intentos+" intentos");
entrada.close();
    }
}
