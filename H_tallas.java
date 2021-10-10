import java.util.*;

public class H_tallas {

   // enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};


   enum Talla{

    MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");

       private Talla(String abreviatura){

           this.abreviatura=abreviatura;

       }

       public String dame_abreviatura(){
           return abreviatura;
       }

       private String abreviatura;
   }
    public static void main(String[] args) {
        /*
        Talla s=Talla.MINI;
        Talla l=Talla.MEDIANO;
        Talla x=Talla.GRANDE;
        Talla xl=Talla.MUY_GRANDE;

        System.out.println(x);*/

        Scanner entrada= new Scanner(System.in);

        System.out.println("Escribe una talla : MINI,MEDIANO,GRANDE,MUY_GRANDE");
        String seleccione_talla=entrada.next().toUpperCase();
        Talla talla1=Enum.valueOf(Talla.class, seleccione_talla);
        entrada.close();
        System.out.println("La talla es: "+ talla1);
        System.out.println("La abreviatura es: "+ talla1.abreviatura);

    }
}
