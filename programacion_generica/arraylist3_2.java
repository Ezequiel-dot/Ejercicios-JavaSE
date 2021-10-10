package programacion_generica;

public class arraylist3_2<t> {
    
    public arraylist3_2(){
        primero=null;
    }

    public void setPrimero(t nuevoValor){
        primero=nuevoValor;
    }

    public t getPrimero(){
        return primero;
    }

    public static void printTrabajador(arraylist3_2<? extends zEmpleado> p){
     //el  ? extends  quiere decir que pude extender de cualquier sub clase de empleado
     
        zEmpleado prim=p.getPrimero();
        System.out.println(prim);
    }

    private t primero;
}
