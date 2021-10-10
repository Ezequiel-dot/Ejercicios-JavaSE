package evento;


import javax.swing.*;

import java.awt.event.*;


public class marcoVentana {
    public static void main(String[] args) {
        marco m=new marco();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco m2=new marco();
        m2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        m.setTitle("Ventana 1");
        m.setBounds(0,0,300,500);
        m2.setTitle("Ventana 2");
        m2.setBounds(300,0,300,500);
    }
}

class marco extends JFrame{

    public marco(){
       // setTitle("Marco Ventana");
        setVisible(true);
       // setBounds(200,200,500,500);

      //  M_Ventana oyenteVentana=new M_Ventana();
       // addWindowListener(oyenteVentana);
       addWindowListener(new M_Ventana());
    }
}

class M_Ventana extends WindowAdapter{

    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    };
    public void	windowClosed(WindowEvent e){
        System.out.println("Ventana ha sido cerrada");
    };
    public void	windowClosing(WindowEvent e){
        System.out.println("Ventana cerrada");
    };
    public void	windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    };
    public void	windowDeiconified(WindowEvent e){
        System.out.println("Ventana restaurada");
    };
    public void	windowIconified(WindowEvent e){
        System.out.println("Ventana minimizada");
    };
    public void	windowOpened(WindowEvent e){
        System.out.println("Ventana abierta");
    };
    

}



