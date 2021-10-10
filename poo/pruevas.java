package poo;

public class pruevas {
public static void main(String[] args) {

    Empleados [] empleado=new Empleados[5];

    empleado[0]=new Empleados("Paco");
    empleado[1]=new Empleados("Pablo");
    empleado[2]=new Empleados("Juan");
    empleado[3]=new Empleados("Palito");
    empleado[4]=new Empleados("Gaston");

   empleado[0].cambiaSeccion("Gerente");
   empleado[3].cambiaSeccion("RRHH");

    for(Empleados el: empleado){
        System.out.println(el.dame_datos());
    }


    System.out.println(Empleados.dame_idsig());
    }
}


class Empleados{

    public Empleados(String nom){

        nombre=nom;
        seccion="administracion";
        id=idSig;
        idSig++;

    }

    public void cambiaSeccion(String seccion){//setter
        this.seccion=seccion;
        
    }

    public String dame_datos(){//getter
        return "El nomre es:"+nombre+" y su seccion es:"+seccion+". Su Id es:"+id;
    }

    public static String dame_idsig(){//static
        return "El id siguiente es: "+idSig;
    }


    private final String nombre;
    private String seccion;
    private int id;
    private static int idSig=1;
}
