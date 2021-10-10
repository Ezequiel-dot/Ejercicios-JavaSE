
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class I_temporizador {
    public static void main(String[] args) {

        DameHora oyente=new DameHora();

        Timer mi_temporizador=new Timer(1000, oyente);
        mi_temporizador.start();
        JOptionPane.showMessageDialog(null, "Presione para terminar");
        System.exit(0);
    }
}


class DameHora implements ActionListener{

    public void actionPerformed(ActionEvent e){

        Date ahora=new Date();
        System.out.println(ahora);
        Toolkit.getDefaultToolkit().beep();

    }

}
