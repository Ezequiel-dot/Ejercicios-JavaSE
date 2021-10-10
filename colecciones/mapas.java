package colecciones;

import java.util.*;
import java.util.Map.Entry;

public class mapas {
    public static void main(String[] args) {

        HashMap<String, empleado> mapa=new HashMap<String, empleado>();

        mapa.put("1", new empleado("Ezequiel"));
        mapa.put("2", new empleado("Juan"));
        mapa.put("3", new empleado("Pepe"));

        mapa.remove("3");//borra
        mapa.put("2",new empleado("Jose"));//intercambia

        System.out.println(mapa);

        System.out.println(mapa.entrySet());

        for (Entry<String, empleado> string : mapa.entrySet()) {
           System.out.print(string.getKey());
            System.out.println(string.getValue());
        }

    }
}

class empleado{
    public empleado(String n){
        nombre=n;
        sueldo=2000;
    }

    public String toString(){
        return "[Nombre: "+nombre+",  sueldo: "+sueldo+"]";
    }

    private String nombre;
    private double sueldo;
}