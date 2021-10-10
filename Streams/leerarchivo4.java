package Streams;

import java.io.*;


public class leerarchivo4 {
    public static void main(String[] args) {

        leerArchivo();
}


   public static void leerArchivo(){
            //  int datos_entrada[]=new int[63547];//tengo que poner el num del contador
            int contador=0;
            
         
            try{
    
                FileInputStream archivo_lectura=new FileInputStream("C:/Users/ezeos/OneDrive/Escritorio/JAVA/aprendiendo/src/grafico/river-plate-logo-png-7.jpg");
                 
                BufferedInputStream numByt=new BufferedInputStream(archivo_lectura);
                int tamaño=numByt.available();

                int datos_entrada[]=new int[tamaño];
                
                boolean arch_fin=false;
    
                while(!arch_fin){
                    int byte_entrada=archivo_lectura.read();
                   
                    if(byte_entrada!=-1){
                     datos_entrada[contador]=byte_entrada;
                    }else{
                        arch_fin=true;
                    }
                    contador++;                   
                }
    
                System.out.println(contador);
    
                archivo_lectura.close();
                crearFichero(datos_entrada);
                
            }catch (IOException e){
             
            }            
        }
    
        static void crearFichero(int datosNuevoFichero[]){
    
            try {
                FileOutputStream fichNuevo=new FileOutputStream("C:/Users/ezeos/OneDrive/Escritorio/JAVA/aprendiendo/src/grafico/river-plate-logo-png-7_copia.jpg");
            
                for(int i=0;i<datosNuevoFichero.length;i++){
                    fichNuevo.write(datosNuevoFichero[i]);
                }
    
                fichNuevo.close();
    
                } catch (IOException e) {           
            }
        }
    }
 