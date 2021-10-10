package poo;

import java.util.*;


public class uso_empleado {

    
   public static void main(String[] args){
       
    /*
    Empleado empleado1=new Empleado("Ezequiel",23000,2003,6,2);
   
    empleado1.sube_sueldo(10);
    System.out.println("nombre: "+empleado1.dame_nombre()+".sueldo: "+empleado1.dame_sueldo());
*/
Jefatura gerente=new Jefatura("Ezequiel",40000,2006,05,06);
gerente.estableceIncentivo(3000);

Empleado [] misEmpleados=new Empleado[6];
misEmpleados[0]=new Empleado("Ezequiel",23000,2003,06,02);
misEmpleados[1]=new Empleado("Franco",25000,2002,01,06);
misEmpleados[2]=new Empleado("Lucas",20000,2005,10,03);
misEmpleados[3]=new Empleado("lorenzo");

misEmpleados[4]=gerente;//polimorfismo
misEmpleados[5]=new Jefatura("Carla", 30000, 2010, 10, 30);

Jefatura jefe_comercial=new Jefatura("Jose",84000,1018,8,25);

System.out.println(jefe_comercial.tomar_decisiones("aumentar el sueldo un 10%"));

System.out.println("El empleado "+misEmpleados[3].dame_nombre()+" tiene un bonus de: "+
 misEmpleados[3].establece_bonus(500));
/*
Comparable ejemplo=new Empleado("Popu",3000,2021,03,15);

if(ejemplo instanceof Comparable ){
    System.out.println("ejemplo es comparable");
}
if(jefe_comercial instanceof Empleado){
    System.out.println("El jefe comrecial es un empleado");
}
*/

//la pasamos de la clase empleados a la clase jefatura
Jefatura jefa_finanzas=(Jefatura) misEmpleados[5];
jefa_finanzas.estableceIncentivo(2000);


/*
double num1=1.75;
int num2=(int) num1;
Pasar de doble a entero
*/


for (Empleado el:misEmpleados){
    el.sube_sueldo(10);
}

Arrays.sort(misEmpleados);

for(Empleado e:misEmpleados){

            System.out.println("Nombre:"+e.dame_nombre()+
            ".   Sueldo:"+ e.dame_sueldo()+
            ".   Fecha de Alta:"+e.dame_fechacontrato()+
            ".   Id:"+ e.dame_id());

        }

    }
}


class Empleado implements  uso_empleado3{

    public int compareTo(Object miObjeto){
        Empleado otroEmpleado=(Empleado) miObjeto;

        if(this.id<otroEmpleado.id){
            return -1;
        }
        if(this.id>otroEmpleado.id){
            return 1;
        }
        return 0;
    }

    public Empleado(String nom,double sue, int año, int mes, int dia){

        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario= new GregorianCalendar(año,mes-1,dia);
        altaContrato=calendario.getTime();
        id=idSig;
        idSig++;

    }

    public double establece_bonus(double bonus){
        return uso_empleado3.min+bonus;
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

    public int dame_id(){//getter
        return id;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSig=1;
     
}


class Jefatura extends Empleado implements uso_empleado2{

    public Jefatura(String nom,double sue,int año,int mes,int dia){
        super(nom,sue,año,mes,dia);
    }

    public String tomar_decisiones(String decision){
        return "El jefe tomó la decision de "+decision;
    }

    public double establece_bonus(double bonus){
        double prima=2000;

        return uso_empleado3.min+bonus+prima;
    }

    public void estableceIncentivo(double num){

        incentivo=num;
    }

    public double dame_sueldo(){
        double sueldoJefe=super.dame_sueldo();
        return sueldoJefe+incentivo;
    }
    private double incentivo;
}


class director extends Jefatura{
    
    public director(String nom,double sue,int año,int mes,int dia){
        super(nom,sue,año,mes,dia);
    }
}