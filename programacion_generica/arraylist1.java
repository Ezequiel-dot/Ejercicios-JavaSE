package programacion_generica;


import java.io.Serializable;
import java.util.*;


public class arraylist1 {
    public static void main(String[] args) {
        

/*Empleado [] misEmpleados=new Empleado[3];
misEmpleados[0]=new Empleado("Juan",26000,2007,04,06);
misEmpleados[1]=new Empleado("Franco",25000,2002,01,06);
misEmpleados[2]=new Empleado("Lucas",20000,2005,10,03);*/

ArrayList <Empleado> misEmpleados=new ArrayList <Empleado>();
misEmpleados.ensureCapacity(12);//opcional
misEmpleados.add(new Empleado("Juan",26000,2007,04,06));
misEmpleados.add(new Empleado("Franco",25000,2002,01,06));
misEmpleados.add(new Empleado("Lucas",20000,2005,10,03));
misEmpleados.add(new Empleado("Juan",26000,2007,04,06));
misEmpleados.add(new Empleado("Franco",25000,2002,01,06));
misEmpleados.add(new Empleado("Lucas",20000,2005,10,03));
misEmpleados.add(new Empleado("Juan",26000,2007,04,06));
misEmpleados.add(new Empleado("Franco",25000,2002,01,06));
misEmpleados.add(new Empleado("Lucas",20000,2005,10,03));
misEmpleados.add(new Empleado("Juan",26000,2007,04,06));
misEmpleados.add(new Empleado("Francoooooo",25000,2002,01,06));
misEmpleados.add(new Empleado("Lucas",20000,2005,10,03));
//misEmpleados.trimToSize();//para que no halla mas elementos

misEmpleados.set(1, new Empleado("Francoooooo",25000,2002,01,06));

System.out.println(misEmpleados.get(1));
/*
        for(Empleado el:misEmpleados){
            System.out.println(el.toString());
           
        }*/

      /*  for(int i=0;i<misEmpleados.size();i++){
            Empleado e=misEmpleados.get(i);
            System.out.println(e);
        }*/

        Iterator <Empleado> mi_iterador=misEmpleados.iterator();

        while(mi_iterador.hasNext()){
            System.out.println(mi_iterador.next().toString());
        }

        System.out.println(misEmpleados.size());
    }
}



class Empleado implements  Serializable{

    private static final long serialVersionUID = 1L;

    public Empleado(String nom,double sue, int año, int mes, int dia){

        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario= new GregorianCalendar(año,mes-1,dia);
        altaContrato=calendario.getTime();
    }

    public  Empleado(String nom){//dato que viene por defecto
        this(nom,15000,2000,01,01);
        
    }

    public String dame_nombre(){//getter
        return nombre;
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

    public String toString(){
		
		return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + altaContrato;
		
	}

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}

//-------------------------------------------------------------------------

class Jefatura extends Empleado {

    private static final long serialVersionUID = 1L;

    public Jefatura(String nom,double sue,int año,int mes,int dia){
        super(nom,sue,año,mes,dia);
    }


    public void estableceIncentivo(double num){

        incentivo=num;
    }

    public double dame_sueldo(){
        double sueldoJefe=super.dame_sueldo();
        return sueldoJefe+incentivo;
    }

    public String toString(){
			
        return super.toString() + " Incentivo=" + incentivo;
        
    }
    private double incentivo;
}

