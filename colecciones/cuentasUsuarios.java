package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class cuentasUsuarios {
    public static void main(String[] args) {

        cliente cl1=new cliente("Eze", "00001", 20000);   
        cliente cl2=new cliente("Juan", "00002", 25000);
        cliente cl3=new cliente("Pablo", "00003", 30000);
        cliente cl4=new cliente("Carlos", "00004", 21000);
        cliente cl5=new cliente("Ezeee", "00001", 20000);  
        Set <cliente> cuentasBanco=new HashSet<cliente>();

        cuentasBanco.add(cl1);
        cuentasBanco.add(cl2);
        cuentasBanco.add(cl3);
        cuentasBanco.add(cl4);
        cuentasBanco.add(cl5);
      /*  for (cliente c : cuentasBanco) {
            System.out.println(c.getNombre()+" "+c.getN_Cuenta()+" "+c.getSaldo());
        }*/

        Iterator <cliente> it=cuentasBanco.iterator();

        while(it.hasNext()){
            String nombreCl=it.next().getNombre();
            System.out.println(nombreCl);

            if(nombreCl.equals("Cristiano Ronaldo")){
                it.remove();
            }
        }
    }
}
