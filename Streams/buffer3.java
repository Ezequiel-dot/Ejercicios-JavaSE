package Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buffer3 {
    public static void main(String[] args) {
        leerFich2 ef=new leerFich2();
        ef.leer1();
        
    }
}

class leerFich2{
    public void leer1(){
        try{
            entrada=new FileReader("C:/eze/leerfichero.txt");
            BufferedReader buff=new BufferedReader(entrada);
            String linea="";

            while(linea!=null){
                linea=buff.readLine();
                if(linea!=null) System.out.print(linea);
            }

            entrada.close();//tambian se podria cerrar en un finally,pero en este caso no es necesario

        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
    }
    FileReader entrada;
}
