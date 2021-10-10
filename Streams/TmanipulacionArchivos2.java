package Streams;

import java.io.*;

public class TmanipulacionArchivos2 {
    public static void main(String[] args) {
        File ruta=new File("C:"+File.separator+"Users"+File.separator+"ezeos"+File.separator+"eclipse-workspace"+File.separator+"texto.txt");
        String archivo_destino=ruta.getAbsolutePath();
        System.out.println(archivo_destino);
        try {
            ruta.createNewFile();
        } catch (Exception e) {
           
        }

        Escribiendo esc_acc=new Escribiendo();
        esc_acc.escribir(archivo_destino);

      //  ruta.delete();//ESTO SE USA PARA BORRAR EL ARCHIVO QUE ESTA EN ESA RUTA,PASA QUE ACA NO TIENE SENTIDO USARLO
    }
}

class Escribiendo{
    public void escribir(String ruta_Ar){
        String frase="Arrancamos paso a paso";
       
        try {
            FileWriter escribe=new FileWriter(ruta_Ar);

            for(int i=0;i<frase.length();i++){
                escribe.write(frase.charAt(i));
            }

            escribe.close();
        } catch (Exception e) {
       
        }
    }
}
