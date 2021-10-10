package programacion_generica;

public class arraylist3_1 {
    public static void main(String[] args) {
        
        arraylist3_2 <String> una=new arraylist3_2<String>();
        una.setPrimero("Juancito");
        System.out.println(una.getPrimero());

        persona pers=new persona("Amenadiel");
        arraylist3_2 <persona> otra=new arraylist3_2<persona>();
        otra.setPrimero(pers);
        System.out.println(otra.getPrimero());
    }
}

class persona{

    public persona(String nombre){
        this.nombre=nombre;
    }

    public String toString(){
        return nombre;
    }

    private String nombre;
}
