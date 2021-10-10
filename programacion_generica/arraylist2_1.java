package programacion_generica;

public class arraylist2_1 {
    
    public arraylist2_1(int z){
        datosElemento=new Object[z];
    }

    public Object get(int i){
        return datosElemento[i];
    }

    public void add(Object o){
        datosElemento[i]=o;
        i++;
    }

    private Object [] datosElemento;
    private int i=0;
}
