package programacion_generica;

import java.io.File;

public class arraylist2_2 {
    public static void main(String[] args) {

        arraylist2_1 array=new arraylist2_1(5);

        array.add(new File("dnehbchdj.dwudhsj"));
        
        array.add("Juan");
        array.add("Pedro");
        array.add("Pablo");
        array.add("Miguel");

        String nombrepersona= (String) array.get(2);

      //  File nomArchivo=(File) array.get(0);

        System.out.println(nombrepersona);

    }
}
