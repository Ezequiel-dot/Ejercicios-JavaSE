

public class A_Estrucura1 {
    public static void main(String[] args) throws Exception {
        
        
       // double raiz= Math.sqrt(9);   
       // double potencia = Math.pow(2, 3);

        String nombre="Ezequiel";
        
        System.out.println("Mi nombre es "+nombre);

        System.out.println("Mi nombre tiene "+nombre.length()+" letras");

        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));

        
        int ultima_letra=nombre.length();
        System.out.println("La ultima letra de mi nombre es "+ nombre.charAt(ultima_letra-1));



        String frase="Esta es una frase cualquiera";

        String resumen_frase=frase.substring(18,28);

        System.out.println(resumen_frase);


        String nombre1,nombre2;

        nombre1="Ezequiel";
        nombre2="ezequiel";

       Boolean comparacion1= nombre1.equals(nombre2);
       
       Boolean comparacion2= nombre1.equalsIgnoreCase(nombre2);

        System.out.println(comparacion1);
        
        System.out.println(comparacion2);
    }
}
