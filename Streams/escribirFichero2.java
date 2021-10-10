package Streams;

import java.io.FileWriter;
import java.io.IOException;

public class escribirFichero2 {
    public static void main(String[] args) {
        escribirFichero ef=new escribirFichero();
        ef.escribir();
    }
}

class escribirFichero{
    public void escribir(){
        String oracion="Esta frase se agrego correctamente";

        try {
            FileWriter escribiendo=new FileWriter("C:/eze/ficheronuevo.txt");
        
            for(int i=0;i<oracion.length();i++){
                escribiendo.write(oracion.charAt(i));
            }

            escribiendo.close();

        } catch (IOException e) {
       
            e.printStackTrace();
        }
    }
}
