package programacion_generica;

import java.util.GregorianCalendar;

public class arrayMetodos_4 {
    public static void main(String[] args) {
      
        String [] nombres={"Juan","Pepe","Eze"};
        String elementos=metodos.<String>getMetodo(nombres);
        System.out.println(elementos);

        String [] num={""};
        System.out.println(metodos.getMetodo(num));

        Empleado [] misEm={
            new Empleado("Juan",26000,2007,04,06),
            new Empleado("Juan",26000,2007,04,06),
            new Empleado("Juan",26000,2007,04,06)
        };
        System.out.println(metodos.getMetodo(misEm));

        System.out.println(metodos2.getMenor(nombres));

        GregorianCalendar [] fecha={
            new GregorianCalendar(2005, 05, 22),
            new GregorianCalendar(2004, 05, 22),
            new GregorianCalendar(2003, 05, 22),
            new GregorianCalendar(2002, 05, 22)
        };

        GregorianCalendar cal=metodos2.getMenor(fecha);
        
        System.out.println(cal);
    }
}

class metodos{
    public static <T> String getMetodo(T[] arr){
        return "El metodo tiene "+arr.length+" elementos.";
    }
}

class metodos2  {
    public static <L extends Comparable> L getMenor(L[] arr){
        if(arr.length==0||arr==null)return null;

        L arraymenor=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arraymenor.compareTo(arr[i])>0){
                arraymenor=arr[i];
            }
        }
        return arraymenor;
    }
}   
