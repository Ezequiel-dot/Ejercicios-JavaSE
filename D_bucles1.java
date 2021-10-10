import javax.swing.JOptionPane;

public class D_bucles1 {
    public static void main(String[] args) throws Exception {

        String nombre="Ezequiel";
        String contra="";

        while(contra.equals(nombre)==false){
            contra=JOptionPane.showInputDialog("ingrese la contraseña");

            if(contra.equals(nombre)==false){
                System.out.println("Contraseña ingresada incorrectamente");
            }
           
        }
        
        System.out.println("Contraseña correcta.Acceso permitido");
    }
}
