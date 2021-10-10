package poo;



public class uso_vehiculo {
    public static void main(String[] args) {
       // coche Toyota=new coche(); //INSTANCIAR UNA CLASE
        
      //  System.out.println("Este coche tiene "+Toyota.ruedas+" ruedas.");
/*
        System.out.println(Toyota.dime_datos_comunes());

        Toyota.color_auto(JOptionPane.showInputDialog("Introduzca color del coche"));
        System.out.println(Toyota.dime_color());

        Toyota.asientos_cuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));  
        System.out.println(Toyota.dime_asientos());

        Toyota.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(Toyota.dime_climatizador());

        System.out.println(Toyota.dime_peso());
        System.out.println("El precio final del auto es de: "+Toyota.precio_final()+" dolares");
    */
        furgoneta furgoneta1=new furgoneta(8,100);

        System.out.println(furgoneta1.dime_datos_furgoneta());
        furgoneta1.asientos_cuero("si");
        System.out.println(furgoneta1.dime_asientos());
      }
}
