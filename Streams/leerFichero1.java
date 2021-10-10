package Streams;

import java.io.FileReader;
import java.io.IOException;

public class leerFichero1 {
    public static void main(String[] args) {
        leerFich lf=new leerFich();
        lf.leer();
    }
}

class leerFich{
    public void leer(){
        try{
            FileReader entrada=new FileReader("C:/eze/leerfichero.txt");
            int c=0;

            while(c!=-1){
                c=entrada.read();
                char letra=(char)c;
                System.out.print(letra);
            }

            entrada.close();//tambian se podria cerrar en un finally,pero en este caso no es necesario

        }catch(IOException e){
            System.out.println("No se encontro el archivo");
        }
    }
}
