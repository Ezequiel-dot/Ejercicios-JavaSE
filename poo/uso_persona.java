package poo;
import java.util.*;


public class uso_persona {
    public static void main(String[] args) {
        persona[] laspersonas=new persona[2];
        laspersonas[0]=new Empleado2("EZE",40000, 2014, 6,03);
        laspersonas[1]=new Alumno("JUAN","ingenieria");

        for(persona e:laspersonas){
            System.out.println(e.dame_nombre()+" " +e.dame_descripcion());
        }
    }
}

abstract class persona{

    public persona(String nom){//constructor
        nombre=nom;
    }
    public String dame_nombre(){//getter
        return  nombre;
    }
    public abstract String dame_descripcion();//clase abstracta


    private String nombre;
}


class Empleado2 extends persona{

    public Empleado2(String nom,double sue, int año, int mes, int dia){

        super(nom);
        
        sueldo=sue;
        GregorianCalendar calendario= new GregorianCalendar(año,mes-1,dia);
        altaContrato=calendario.getTime();
        id=idSig;
        idSig++;

    }

    public String dame_descripcion(){
        return "Sueldo de "+sueldo+". Con el id:"+id;
    }

    public double dame_sueldo(){//getter
        return sueldo;
    }

    public Date dame_fechacontrato(){//getter
        return altaContrato;
    } 

    public void sube_sueldo(double porcentaje){//setter

        double aumento=sueldo*porcentaje/100;

        sueldo+=aumento;
    }

    public int dame_id(){//getter
        return id;
    }

   
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSig=1;
     
}

class Alumno extends persona{
    public Alumno(String nom,String car){
        super(nom);
        carrera=car;

    }

    public String dame_descripcion(){
        return "Este alumno estuda la carrera de "+carrera;
    }

    private String carrera; 
}


