import java.util.Scanner;

import javax.swing.JOptionPane;

public class C_condicionales {
    public static void main(String[] args) throws Exception {
/*
        Scanner entrada=new Scanner(System.in);

    
        System.out.println("Introduzca su edad");


        
        int edad=entrada.nextInt();

        
        if(edad>=18&&edad<50){
            System.out.println("eres mayor de edad");
        }else if(edad>49){
            System.out.println("eres un anciano");
        }else{
            System.out.println("eres menor de edad");
        }
*/

        Scanner entrada=new Scanner(System.in);

        System.out.println("Elige una opcion: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo \n4:Círculo");

        int numero=entrada.nextInt();

        entrada.close();

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
    }
}
