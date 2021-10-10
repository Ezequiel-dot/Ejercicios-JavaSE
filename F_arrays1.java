import javax.swing.JOptionPane;

public class F_arrays1 {
    public static void main(String[] args) throws Exception {
    /*
    int [] matriz=new int [5];
    matriz[0]=1;
    matriz[1]=45;
    matriz[2]=-33;
    matriz[3]=467;
    matriz[4]=45;
*/

    int [] matriz={1,45,-22,467,45,43,64,24,6,335};
        //FOR
    for(int i=0;i<matriz.length;i++){
        System.out.println("Valor del índice "+(i+1)+" = "+matriz[i]);
    }
        //FOREACH
    for(int el:matriz){
        System.out.println(el);
    }

    String []paises=new String[5];

    for(int i=0 ;i<5;i++){
        paises[i]=JOptionPane.showInputDialog("Introduzca país "+(i+1));
        System.out.println(paises[i]);
    }

    }
}
