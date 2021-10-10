package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;


public class serializacion1 {

    
   public static void main(String[] args){
       
 
Jefatura gerente=new Jefatura("Ezequiel",40000,2006,05,06);
gerente.estableceIncentivo(3000);

Empleado [] misEmpleados=new Empleado[3];
misEmpleados[0]=gerente;
misEmpleados[1]=new Empleado("Franco",25000,2002,01,06);
misEmpleados[2]=new Empleado("Lucas",20000,2005,10,03);

try {
                //ESTO ES PARA ESCRIBIR FICHERO
    ObjectOutputStream escribir_fichero=new ObjectOutputStream(new FileOutputStream("C:/Users/ezeos/OneDrive/Escritorio/JAVA/aprendiendo/src/Streams/empleado.dat"));
    escribir_fichero.writeObject(misEmpleados);
    escribir_fichero.close();
                //ESTO ES PARA LEER EL FICHERO Y SE PUEDE EJECUTAR SIN escribir fichero
    ObjectInputStream leer_fichero=new ObjectInputStream(new FileInputStream("C:/Users/ezeos/OneDrive/Escritorio/JAVA/aprendiendo/src/Streams/empleado.dat"));
    Empleado[] personal_recuperado=(Empleado[]) leer_fichero.readObject();
    leer_fichero.close();

      for(Empleado el:personal_recuperado){
        System.out.println(el);
     }

      } catch (Exception e) {
    
        }
    }

}

//-------------------------------------------------------------------------

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




