

import javax.swing.JOptionPane;

public class B_entrada {
    public static void main(String[] args) throws Exception {

     // Scanner entrada=new Scanner(System.in);
/*
        System.out.println("Introduzaca su nombre");

        String nombre_usuario=entrada.nextLine();

        System.out.println("Introduzaca su edad");

        int edad_usuario=entrada.nextInt();

        System.out.println("Hola "+nombre_usuario+". El año que viene tendras "+(edad_usuario+1)+" años.");
*/


/*
        String apellido_usuario= JOptionPane.showInputDialog("Introduzca su apellido");
        String edad_usuario= JOptionPane.showInputDialog("Introduzca su edad");
        int edad=Integer.parseInt(edad_usuario);
        //pasa un string a un numero entero

        System.out.println("Hola "+apellido_usuario+".Su edad es "+(edad+1));


*/



        String numero_usuario= JOptionPane.showInputDialog("Introduzca cualquier numero");

        double num=Double.parseDouble(numero_usuario);

        System.out.print("La raiz de "+num+" es:");

        System.out.printf("%1.2f",Math.sqrt(num));

    }
}
