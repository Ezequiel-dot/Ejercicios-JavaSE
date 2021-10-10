
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;


public class J_temporizador2 {
    public static void main(String[] args) {

        reloj mireloj=new reloj();

        mireloj.enMarcha(2,true);;

        JOptionPane.showMessageDialog(null, "Presione para terminar");
        System.exit(0);
    }
}


class reloj{

    public void enMarcha(int intervalo,final boolean sonido){

        class DameHora2 implements ActionListener{
            public void actionPerformed(ActionEvent e){
                Date hora=new Date();
                System.out.println(hora);
    
                if(sonido == true){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente=new DameHora2();
        Timer mitempo=new Timer((intervalo*1000),oyente);
        mitempo.start();
    }
}
