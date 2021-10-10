
package colecciones;

import java.util.*;

public class treeset {
    public static void main(String[] args) {
        
      /*  TreeSet <String> ordPer=new TreeSet<String>();
        ordPer.add("Ezequiel");

        for (String string : ordPer) {
            System.out.println(ordPer);
        }*/

        articulo art1=new articulo(1,"primer articulo");
        articulo art2=new articulo(2,"segundo articulo");
        articulo art3=new articulo(3,"tercer articulo");

        TreeSet<articulo> art=new TreeSet<articulo>();
        art.add(art1);
        art.add(art2);
        art.add(art3);

        for (articulo a : art) {
            System.out.println(a.getDescripcion);
        }
        
  //  articulo comparadorArticulo=new articulo();
  //  TreeSet<articulo> ordenaArticulo2=new TreeSet<articulo>(comparadorArticulo);
   
  //  comparaArt ca=new comparaArt();
    TreeSet<articulo> ordenaArticulo2=new TreeSet<articulo>(new Comparator<articulo>(){
        public int compare(articulo a,articulo b){
            String descripa=a.getDescripcion();  
            String descripb=b.getDescripcion(); 
    
            return descripa.compareTo(descripb);
        }
    });

    ordenaArticulo2.add(art1);
    ordenaArticulo2.add(art2);
    ordenaArticulo2.add(art3);
    
    for(articulo aa:ordenaArticulo2){
        System.out.println(aa.getDescripcion);
    }
    }
}


class articulo implements Comparable<articulo>/*, Comparator <articulo>*/{

    public articulo(){
        
    }

    public articulo(int num,String des){
        this.num=num;
        this.des=des;
    }
    public int compareTo(articulo o) {
        return num - o.num;
    }
    public String getDescripcion(){
        return des;
    }
    //ordena alfabeticamente
/*    public int compare(articulo a,articulo b){
        String descripa=a.getDescripcion();  
        String descripb=b.getDescripcion(); 

        return descripa.compareTo(descripb);
    }*/

    private int num;
    private String des;
}

/*
class comparaArt implements Comparator<articulo>{
    public int compare(articulo a,articulo b){
        String descripa=a.getDescripcion();  
        String descripb=b.getDescripcion(); 

        return descripa.compareTo(descripb);
    }
}*/

