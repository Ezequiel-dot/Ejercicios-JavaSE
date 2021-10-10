package colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
    public static void main(String[] args) {

        /*
        LinkedList <String> personas=new LinkedList <String>();

        personas.add("pepe");
        personas.add("jose");
        personas.add("pepa");
        personas.add("jorge");

        ListIterator<String> it= personas.listIterator();

        it.next();
        it.next();

        it.add("Ezequiel");
        System.out.println(personas.size());

        for (String e : personas) {
            System.out.println(e);
        }
        */

        LinkedList <String> paises=new LinkedList <String>();

        paises.add("Argentina");
        paises.add("Uruguay");
        paises.add("Brasil");
        paises.add("Chile");

        LinkedList <String> paises2=new LinkedList <String>();

        paises2.add("España");
        paises2.add("Alemania");
        paises2.add("Portual");
        paises2.add("Francia");

      //  System.out.println(paises);

      ListIterator <String> it=paises.listIterator();
      ListIterator <String> it2=paises2.listIterator();

      while(it2.hasNext()){
          
        if(it.hasNext()){
            it.next();  
            it.add(it2.next());
        }
      }


      for (String string : paises) {
          System.out.println(string);
      }
      System.out.println(paises);

      it2=paises2.listIterator();
      
      while(it2.hasNext()){
          it2.next();
          if(it2.hasNext()){
            it2.next();
              it2.remove();
          }
      }
      System.out.println(paises2);
      paises.removeAll(paises2);
      System.out.println(paises);
    }
}
