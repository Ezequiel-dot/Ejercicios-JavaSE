package programacion_generica;

public class zEmpleado {
    public zEmpleado(int edad,String nombre,double salario){
        this.edad=edad;
        this.nombre=nombre;
        this.salario=salario;
    }

    public String getDatos(){
        return "El nombre es "+nombre+" tiene "+edad+" años"+" y cobra "+salario;
    }

    private int edad;
    private String nombre;
    private double salario;
}

class jefe extends zEmpleado{
    public jefe(int edad,String nombre,double salario){
        super(edad, nombre, salario);
    }

    double incentivo(double inc){
        return inc;
    }
}
