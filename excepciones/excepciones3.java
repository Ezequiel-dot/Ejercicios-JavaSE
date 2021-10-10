package excepciones;

import javax.swing.JOptionPane;

public class excepciones3 {
    public static void main(String[] args) {
        try{
        division();
        }catch(ArithmeticException e){
            System.out.println("Estas dividiendo por 0");
        }catch(NumberFormatException e){
            System.out.println("No has introducido un numero entero");

            System.out.println("Se ha generado un error de este tipo: "+e.getClass().getName());
        }
    }
    static void division(){
    int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce dividendo"));
    int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce divisor"));
    System.out.println("El resultado es: "+num1/num2);
    }
}

