package Streams;

import java.io.*;

public class TmanipulacionArchivos {
    public static void main(String[] args) {


        File ruta=new File("C:"+File.separator+"ezeos"+File.separator+"OneDrive"+File.separator+"Escritorio"+File.separator+"JAVA"+File.separator+"aprendiendo/src");
    
        System.out.println(ruta.getAbsolutePath());

        String[] nomArchivo= ruta.list();

        for(String el:nomArchivo){

            System.out.println(el);

            File f=new File(ruta.getAbsoluteFile(),el);
            
            if(f.isDirectory()){
                String[] subCarpetaArchivo=f.list();
                for(String e:subCarpetaArchivo){
                    System.out.println(e);
                }
            }
        }    
    }
}
