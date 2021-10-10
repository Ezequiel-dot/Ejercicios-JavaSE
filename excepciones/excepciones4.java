package excepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class excepciones4 {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Elige una opcion: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo \n4:Círculo");

        try{
        numero=entrada.nextInt();
        }catch(Exception e){
            System.out.println("Lo ingresado no fue un numero");
        }finally{
            entrada.close();
        }

        switch (numero) {
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

                System.out.println("El area del cuadrado es "+Math.pow(lado, 2));

                break;

            case 2:
                int lado1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer lado"));
                int lado2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo lado"));

                System.out.println("El area del rectangulo es "+(lado1*lado2));

                break;
            case 3:
                int lado3=Integer.parseInt(JOptionPane.showInputDialog("Introduce el ancho del triangulo"));
                int lado4=Integer.parseInt(JOptionPane.showInputDialog("Introduce el alto del triangulo"));

                System.out.println("El area del triangulo es "+(lado3*lado4/2));

                break;
            case 4:
                int circulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                

                System.out.print("El area del circulo es ");

                System.out.printf("%1.2f", Math.PI*(Math.pow(circulo, 2)));


                break;
                default:

                System.out.println("El numero ingresado no es el correcto");

         }
         //----------------------------------------------------------------
         int peso=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));

         System.out.println("Si eres hombre tu peso ideal es "+(peso-110));
         System.out.println("Si eres mujer tu peso ideal es "+(peso-120));

    }

    static int numero;
    
}
