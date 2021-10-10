package evento;

import javax.swing.JFrame;

import java.awt.*;

import java.awt.event.*;

public class marcoVentana2 {
    public static void main(String[] args) {
        Marco2 marc=new Marco2();
        marc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco2 extends JFrame{
    public Marco2(){
        setVisible(true);
        setBounds(50,50,500,300);
        setTitle("Mi Venttana");

        addWindowStateListener(new CambiaEstado());
    }
}

class CambiaEstado implements WindowStateListener {

    public void windowStateChanged(WindowEvent e){
    //    System.out.println("La consola cambio de estadeshon "+e.getNewState()+" "+e.getOldState());
        
        if(e.getNewState()==6){
            System.out.println("La ventana esta pantalla completa");
        }else if(e.getNewState()==Frame.NORMAL){
            System.out.println("La ventana esta normal");
        }else if(e.getNewState()==Frame.ICONIFIED){
            System.out.println("La ventana esta MINIMIZADA");
        }
    
    }

}
