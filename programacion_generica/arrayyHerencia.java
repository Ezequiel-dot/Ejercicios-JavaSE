package programacion_generica;

public class arrayyHerencia {
    public static void main(String[] args) {
        
      //  zEmpleado administrativo=new zEmpleado(37, "Carla", 27000);
      //  jefe director=new jefe(35, "Pablo", 35000);

        arraylist3_2 <zEmpleado> admin=new arraylist3_2 <zEmpleado>();
        arraylist3_2 <jefe> director=new arraylist3_2 <jefe>();

        arraylist3_2.printTrabajador(admin);
        arraylist3_2.printTrabajador(director);
        
    }
}
